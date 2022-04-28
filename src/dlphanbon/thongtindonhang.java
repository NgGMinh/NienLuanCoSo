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
public class thongtindonhang {
    private String maso;
    private String tenhang;
    private String soluong;
    private String dongia;
    private String thanhtien;
    
    public thongtindonhang(){
        
    }

    public thongtindonhang(String maso, String tenhang, String soluong, String dongia, String thanhtien) {
        this.maso = maso;
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
