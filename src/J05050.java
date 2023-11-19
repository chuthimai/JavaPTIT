//J05050 TÍNH TIỀN ĐIỆN

import java.util.Scanner;

public class J05050 {
    private static class KhachHang{
        private static int sMa = 1;
        private String ma, loaiSD;
        private int soCu, soMoi, heSo;
        private double thanhTien, phuTroi, tongTien;

        public KhachHang(Scanner sc) {
            ma = String.format("KH%02d", sMa++);
            loaiSD = sc.next();
            soCu = sc.nextInt();
            soMoi = sc.nextInt();
            setHeSo();
            setThanhTien();
            setPhuTroi();
            setTongTien();

        }

        public void setThanhTien() {
            this.thanhTien = (soMoi - soCu)*heSo*550;
        }

        public void setPhuTroi() {
            if (soMoi - soCu < 50) phuTroi = 0;
            else if (soMoi - soCu <= 100) phuTroi = thanhTien * 35 / 100;
            else phuTroi = thanhTien;
        }

        public void setTongTien() {
            this.tongTien = phuTroi + thanhTien;
        }

        public void setHeSo() {
            if (loaiSD.equals("KD")) heSo = 3;
            else if (loaiSD.equals("NN")) heSo = 5;
            else if (loaiSD.equals("TT")) heSo = 4;
            else if (loaiSD.equals("CN")) heSo = 2;
        }

        @Override
        public String toString() {
            return ma+" "+heSo+" "+Math.round(thanhTien)+" "+(int) Math.ceil(phuTroi)+" "+Math.round(tongTien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            KhachHang khachHang = new KhachHang(sc);
            System.out.println(khachHang);
        }
    }
}
