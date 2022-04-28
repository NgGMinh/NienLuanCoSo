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
public class chitietdonhang {
    private String CTDH_mahang;
    private String CTDH_tenhang;
    private String CTDH_soluong;
    private String CTDH_giaban;

    public chitietdonhang(){
        
    }
    public chitietdonhang(String CTDH_mahang, String CTDH_tenhang, String CTDH_soluong, String CTDH_giaban) {
        this.CTDH_mahang = CTDH_mahang;
        this.CTDH_tenhang = CTDH_tenhang;
        this.CTDH_soluong = CTDH_soluong;
        this.CTDH_giaban = CTDH_giaban;
    }


    public String getCTDH_mahang() {
        return CTDH_mahang;
    }

    public void setCTDH_mahang(String CTDH_mahang) {
        this.CTDH_mahang = CTDH_mahang;
    }

    public String getCTDH_tenhang() {
        return CTDH_tenhang;
    }

    public void setCTDH_tenhang(String CTDH_tenhang) {
        this.CTDH_tenhang = CTDH_tenhang;
    }

    public String getCTDH_soluong() {
        return CTDH_soluong;
    }

    public void setCTDH_soluong(String CTDH_soluong) {
        this.CTDH_soluong = CTDH_soluong;
    }

    public String getCTDH_giaban() {
        return CTDH_giaban;
    }

    public void setCTDH_giaban(String CTDH_giaban) {
        this.CTDH_giaban = CTDH_giaban;
    }

    
    
}
