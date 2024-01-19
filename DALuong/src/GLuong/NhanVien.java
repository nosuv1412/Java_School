/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

/**
 *
 * @author Hien Vu
 */
public class NhanVien extends Person{
    private String DiaChi;
    private double Luong;

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public NhanVien() {
    }

    public NhanVien(String DiaChi, double Luong, String MaNhanVien, String HoTen) {
        super(MaNhanVien, HoTen);
        this.DiaChi = DiaChi;
        this.Luong = Luong;
    }

    public NhanVien(String DiaChi, double Luong) {
        this.DiaChi = DiaChi;
        this.Luong = Luong;
    }
    
    
}
