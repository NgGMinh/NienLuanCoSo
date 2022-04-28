/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlphanbon;

/**
 *
 * @author Dell
 */
public class danhsachdonhang {
    private String MaDH;
    private String khachhang;
    private String ngaylap;
    private String nguoilap;
    private String tongtien;
    
    public danhsachdonhang(){
        
    }

    public danhsachdonhang(String MaDH, String khachhang, String ngaylap, String nguoilap) {
        this.MaDH = MaDH;
        this.khachhang = khachhang;
        this.ngaylap = ngaylap;
        this.nguoilap = nguoilap;
    }

    public String getMaDH() {
        return MaDH;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }

    public String getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(String khachhang) {
        this.khachhang = khachhang;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getNguoilap() {
        return nguoilap;
    }

    public void setNguoilap(String nguoilap) {
        this.nguoilap = nguoilap;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }
    
    
    
}
