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
public class nhatkynhapkho {
    private String stt;
    private String mahang;
    private String soluongnhapkho;
    private String ngaynhap;
    
    public nhatkynhapkho(){
        
    }

    public nhatkynhapkho(String stt, String mahang, String soluongnhapkho, String ngaynhap) {
        this.stt = stt;
        this.mahang = mahang;
        this.soluongnhapkho = soluongnhapkho;
        this.ngaynhap = ngaynhap;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getSoluongnhapkho() {
        return soluongnhapkho;
    }

    public void setSoluongnhapkho(String soluongnhapkho) {
        this.soluongnhapkho = soluongnhapkho;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    
}
