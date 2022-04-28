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
public class hanghoa {
    private String mahanghoa;
    private String tenhanghoa;
    private String loaihang;
    private String dongia;
    private String slt;
    
    
    public hanghoa(){
        
    }

    public hanghoa(String mahanghoa, String tenhanghoa, String loaihang, String dongia, String slt) {
        this.mahanghoa = mahanghoa;
        this.tenhanghoa = tenhanghoa;
        this.loaihang = loaihang;
        this.dongia = dongia;
        this.slt = slt;
    }

    public String getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(String mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public String getLoaihang() {
        return loaihang;
    }

    public void setLoaihang(String loaihang) {
        this.loaihang = loaihang;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getSlt() {
        return slt;
    }

    public void setSlt(String slt) {
        this.slt = slt;
    }
    
    
}
