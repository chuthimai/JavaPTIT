//J05036 TÍNH GIÁ BÁN - 1

import java.util.Scanner;

public class J05036 {
    private static class MatHang {
        private static int sMa = 1;
        private String ma, ten, dv;
        private int soLuong;
        private double donGiaNhap, phiVanChuyen, thanhTien, giaBan;

        public MatHang(Scanner sc){
            ma = "MH" + String.format("%02d", sMa++);
            sc.nextLine();
            ten = sc.nextLine();
            dv = sc.nextLine();
            donGiaNhap = sc.nextDouble();
            soLuong = sc.nextInt();
            setPhiVanChuyen();
            setThanhTien();
            setGiaBan();
        }

        public void setPhiVanChuyen() {
            phiVanChuyen = (donGiaNhap*soLuong)/20;
        }

        public void setThanhTien() {
            thanhTien = donGiaNhap*soLuong + phiVanChuyen;
        }

        public void setGiaBan() {
            giaBan = thanhTien*1.02;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+dv+" "+Math.round(phiVanChuyen)+" "+Math.round(thanhTien)+" "+Math.round(giaBan);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) System.out.println(new MatHang(sc));
    }
}
