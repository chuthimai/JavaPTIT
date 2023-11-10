//J05037 TÍNH GIÁ BÁN - 2

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05037 {
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
            giaBan = thanhTien*1.02/soLuong;
            if (Math.round(giaBan) % 100 > 0) giaBan =((int) (giaBan/100) + 1)* 100;
        }

        public double getGiaBan() {
            return giaBan;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+dv+" "+Math.round(phiVanChuyen)+" "+Math.round(thanhTien)+" "+Math.round(giaBan);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new MatHang(sc));
        all.sort(new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return Double.compare(o2.getGiaBan(), o1.getGiaBan());
            }
        });

        for (MatHang matHang: all) System.out.println(matHang);
    }
}
