/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

/**
 *
 * @author Hien Vu
 */
public class Person {
    private String MaNhanVien;
    private String HoTen;

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Person(String MaNhanVien, String HoTen) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
    }

    public Person() {
    }
    
}
