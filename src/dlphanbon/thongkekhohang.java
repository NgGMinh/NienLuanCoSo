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
public class thongkekhohang {
    private String tenhang;
    private String slt;
    private String mahang;
    
        public thongkekhohang(){
        
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }
    


    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getSlt() {
        return slt;
    }

    public void setSlt(String slt) {
        this.slt = slt;
    }

    public thongkekhohang(String tenhang, String slt, String mahang) {
        this.tenhang = tenhang;
        this.slt = slt;
        this.mahang = mahang;
    }
}
