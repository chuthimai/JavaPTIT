package DemoKT2;

public class GiaoDichTT extends GiaoDich implements IThanhTien{
    private double tygia;
    private String loaiTT;

    public GiaoDichTT() {
        super();
    }

    public GiaoDichTT(String ngay, double gia, int soluong) {
        super(ngay, gia, soluong);
    }

    @Override
    public String getMa() {
        return super.getMa();
    }

    @Override
    public void setMa(String ma) {
        super.setMa(ma);
    }

    @Override
    public double getGia() {
        return super.getGia();
    }

    @Override
    public int getSoluong() {
        return super.getSoluong();
    }

    @Override
    public double getThanhTien() {
        return 0;
    }
}
