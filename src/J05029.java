//J05029 DANH SÁCH DOANH NGHIỆP NHẬN SINH VIÊN THỰC TẬP - 2

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {
    private static class DoanhNghiep implements Comparable<DoanhNghiep>{
        private String ma, ten;
        private int soSV;

        public DoanhNghiep(Scanner sc) {
            ma = sc.next();
            sc.nextLine();
            ten = sc.nextLine();
            soSV = sc.nextInt();
        }

        public int getSoSV() {
            return soSV;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soSV;
        }

        @Override
        public int compareTo(DoanhNghiep o) {
            if (soSV == o.soSV) return ma.compareTo(o.ma);
            return Integer.compare(o.soSV, soSV);
        }
    }

    private static class QuanLyDN {
        ArrayList<DoanhNghiep> list;

        public QuanLyDN(ArrayList<DoanhNghiep> list) {
            this.list = list;
        }

        public void filter(int from, int to) {
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+from+" DEN "+to+" SINH VIEN:");
            for (DoanhNghiep dn: list) {
                if (dn.getSoSV() >= from && dn.getSoSV() <= to) System.out.println(dn);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new DoanhNghiep(sc));
        Collections.sort(all);
        QuanLyDN ql = new QuanLyDN(all);
        int q = sc.nextInt();
        for (int i=0; i<q; i++) ql.filter(sc.nextInt(), sc.nextInt());
    }
}
