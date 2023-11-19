package model;

import java.io.Serializable;

public class Sach implements Serializable {
    private static int sMa = 1;
    private String ma, tenSach, tenTG, chuyenNganh;
    private int soLuong;

    public Sach(){

    }

    public Sach(String tenSach, String tenTG, String chuyenNganh, int soLuong) {
        this.ma = String.format("%05d", sMa++);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.chuyenNganh = chuyenNganh;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Object[] toObject(){
        return new Object[]{
                ma, tenSach, tenTG, chuyenNganh
        };
    }
}
