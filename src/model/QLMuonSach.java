package model;

import java.io.Serializable;

public class QLMuonSach implements Serializable {
    private Sach sach;
    private BanDoc banDoc;
    private int soDauSach;

    public QLMuonSach(Sach sach, BanDoc banDoc, int soDauSach) {
        this.sach = sach;
        this.banDoc = banDoc;
        this.soDauSach = soDauSach;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public int getSoDauSach() {
        return soDauSach;
    }

    public void setSoDauSach(int soDauSach) {
        this.soDauSach = soDauSach;
    }

    public Object[] toObject(){
        return new Object[]{
                banDoc.getMa(), banDoc.getHoTen(), sach.getMa(), soDauSach
        };
    }
}
