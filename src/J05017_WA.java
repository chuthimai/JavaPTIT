//J05017 HÓA ĐƠN TIỀN NƯỚC

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J05017_WA {

    private static class Bill implements Comparable<Bill>{
        private static int sMa = 1;
        private String ma, tenKH;
        private int soDau, soCuoi, soDien;
        private double tien;

        public Bill(Scanner sc) {
            ma = "KH" + String.format("%02d", sMa++);
            tenKH = sc.nextLine();
            soDau = Integer.parseInt(sc.nextLine());
            soCuoi = Integer.parseInt(sc.nextLine());
            soDien = soCuoi - soDau;
            tinhTien();
        }

        public void tinhTien(){
            if (soDien > 100) tien = (50*100 + 50*150 + (soDien-100)*200) *1.05;
            else if (soDien > 50) {
                tien = (50*100 + (soDien-50)*150) *1.03;
            }
            else tien = (soDien*100*1.02);
        }

        @Override
        public String toString() {
            if (tien - (int) tien < 0.5) return ma+" "+tenKH+" "+(int) tien;
            else return ma+" "+tenKH+" "+(int) tien + 1;
        }

        @Override
        public int compareTo(Bill o) {
            if (o.tien - tien != 0) return Double.compare(o.tien, tien);
            return ma.compareTo(o.ma);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Bill> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new Bill(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
