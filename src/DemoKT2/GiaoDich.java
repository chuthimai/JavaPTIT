package DemoKT2;

public class GiaoDich {
    static int sMa = 0;
    private String ma, ngay;
    private double gia;
    private int soluong;
    public GiaoDich() {

    }

    public GiaoDich(String ngay, double gia, int soluong){
        this.ngay = ngay;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = String.format("%03d", sMa++);
    }

    public double getGia() {
        return gia;
    }

    public int getSoluong() {
        return soluong;
    }
}
