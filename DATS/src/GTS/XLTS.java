/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GTS;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Vector;
/**
 *
 * @author vietp
 */
public class XLTS implements IThisinh{
    Connection cn = null;
    @Override
    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlts","root","");
            System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println("Loi ket noi"+e);
        }
        return cn;
    }

    @Override
    public Vector<Thisinh> getTS() {
        Vector <Thisinh> vts=new Vector<>();
        cn=getCon();
        Statement smt=null;
        try {
            String query="select * from tbthisinh";
            smt=(Statement) cn.createStatement();
            ResultSet rs=smt.executeQuery(query);
            while(rs.next()){
                Thisinh ts=new Thisinh();
                ts.setSoBD(rs.getString("SoBD"));
                ts.setHoten(rs.getString("Hoten"));
                ts.setGT(rs.getString("GT"));
                ts.setNganhH(rs.getString("NganhH"));
                ts.setTongD(rs.getDouble("TongD"));
                vts.add(ts);
            }
            
        } catch (Exception e) {
            System.out.println("Loi khong lay duoc TS: "+e);
        }
        return vts;
    }

    @Override
    public void insertTS(Thisinh ts) {
        cn=getCon();
        PreparedStatement psmt=null;
        try {
            String query="insert into tbthisinh(SoBD,Hoten,GT,NganhH,TongD) values(?,?,?,?,?)";
            psmt=cn.prepareStatement(query);
            psmt.setString(1, ts.getSoBD());
            psmt.setString(2, ts.getHoten());
            psmt.setString(3, ts.getGT());
            psmt.setString(4, ts.getNganhH());
            psmt.setDouble(5, ts.getTongD());
            int row=psmt.executeUpdate();
            if(row!=0) System.out.println("Them thanh cong");
        } catch (Exception e) {
            System.out.println("Loi them TS: "+e);
        }
    }
    
}
