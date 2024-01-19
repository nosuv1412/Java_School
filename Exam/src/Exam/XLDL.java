/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Hien Vu
 */
public class XLDL {
    Connection conn = null;
    
    public Connection getCon(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rectangle", "root", "");                 
        }catch (Exception e){
            System.out.println("Ket noi that bai" + e);
        }
        return conn;
    }
    
    public  Vector getRetangle(){
        Vector datas = new Vector();
        conn = getCon();
        Statement smt = null;
        try{
            String query = "select * from tbRectangle";
            smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while(rs.next()){
                Vector v = new Vector();
                int id = rs.getInt("ID");
                Retangle r = new Retangle();
                r.setFilled(rs.getBoolean("filled"));
                r.setColor(rs.getString("color"));
                r.setWidth(rs.getDouble("width"));
                r.setLength(rs.getDouble("length"));
                v.add(id);
                v.add(r);
                datas.add(v);
            }
                
        }catch(Exception e){
            System.out.println("Loi khong lay duoc du lieu " + e );
        }
        return datas;
    }
    
    public void update(int id, Retangle r){
        conn = getCon();
        PreparedStatement pstm = null;
        try {
            String query = "update tbCylinder set(?,?,?) where id=?";
            pstm = conn.prepareStatement(query);
            pstm.setBoolean(1, r.isFilled());
            pstm.setString(2, r.getColor());
            pstm.setDouble(3, r.getWidth());
            pstm.setDouble(4, r.getLength());
            pstm.setInt(5, id);
            
            int row = pstm.executeUpdate();
            if (row != 0) System.out.println("Cap nhat thanh cong");
            
        } catch (Exception e) {
            System.out.println("Loi cap nhat tai "+ e);
        }
    }
}
