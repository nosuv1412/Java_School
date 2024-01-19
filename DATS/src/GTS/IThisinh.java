/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GTS;
import java.sql.*;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author vietp
 */
public interface IThisinh {
    public Connection getCon();
    public Vector<Thisinh> getTS();
    public void insertTS(Thisinh ts);
}
