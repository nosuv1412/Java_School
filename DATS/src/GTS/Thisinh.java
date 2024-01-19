/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GTS;

/**
 *
 * @author vietp
 */
public class Thisinh {
    private String SoBD;
    private String Hoten;
    private String GT;
    private String NganhH;
    private double TongD;

    public Thisinh() {
    }
    
    public Thisinh(String SoBD, String Hoten, String GT, String NganhH, double TongD) {
        this.SoBD = SoBD;
        this.Hoten = Hoten;
        this.GT = GT;
        this.NganhH = NganhH;
        this.TongD = TongD;
    }

    public String getSoBD() {
        return SoBD;
    }

    public void setSoBD(String SoBD) {
        this.SoBD = SoBD;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getNganhH() {
        return NganhH;
    }

    public void setNganhH(String NganhH) {
        this.NganhH = NganhH;
    }

    public double getTongD() {
        return TongD;
    }

    public void setTongD(double TongD) {
        this.TongD = TongD;
    }
    
    public String Hongbong(){
        if(TongD>=29)
            return  "HB";
        else
            return "";
    }
}
