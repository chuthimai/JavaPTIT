package model;

import java.io.Serializable;

public class BanDoc implements Serializable {
    private static int sMa = 1;
    private String ma, hoTen, diaChi, sdt;

    public BanDoc() {
    }

    public BanDoc(String hoTen, String diaChi, String sdt) {
        this.ma = String.format("%05d", sMa++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Object[] toObject(){
        return new Object[]{
                ma, hoTen, diaChi, sdt
        };
    }
}
