/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hien Vu
 */
public class XLLuong {
    public static Connection getCon() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlluong", "root", "");
            System.out.println("Connected.");

        } catch (Exception e) {
            System.out.println("Error." + e);

        }
        return conn;
    }
    
    public static List<NhanVien> getNvbyMa(String MaNv) {
        List<NhanVien> nhanvien = new ArrayList<>();
        PreparedStatement stmt = null;
        Connection conn = getCon();
        try {
            String query = "Select *from tbnhanvien where MaNv = ?";
            stmt = conn.prepareCall(query);
            stmt.setString(1, MaNv);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString("DiaChi"),
                        rs.getFloat("Luong"), rs.getString("MaNv"), rs.getString("HoTen")
                );
                nhanvien.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XLLuong.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XLLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XLLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return nhanvien;
    }

    public static void updateNV(NhanVien nv) {
        Connection conn = getCon();
        PreparedStatement statement = null;

        try {
            String query = "Update tbnhanvien set MaNv = ?,Hoten= ?,DiaChi=?,Luong=?";
            statement = conn.prepareCall(query);
             statement.setString(1, nv.getMaNhanVien());
            statement.setString(2, nv.getHoTen());
            statement.setString(3, nv.getDiaChi());
            statement.setFloat(4, (float) nv.getLuong());
           
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(XLLuong.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XLLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XLLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
