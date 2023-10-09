package DemoKT2;

public class GiaoDichVang extends GiaoDich implements IThanhTien{
    private String loai;
    public GiaoDichVang() {

    }

    public String getLoai() {
        return loai;
    }

    @Override
    public void setMa(String ma) {
        super.setMa("V-"+super.getMa());
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public double getThanhTien() {
        return 0;
    }
}
