//J05034 DANH SÁCH THỰC TẬP - 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    private static class SinhVien implements Comparable<SinhVien>{
        private static int sMa = 1;
        private int stt;
        private String ma, ten, lop, email, doanhNghiep;

        public SinhVien(Scanner sc) {
            stt = sMa++;
            ma = sc.next();
            sc.nextLine();
            ten = sc.nextLine();
            lop = sc.next();
            email = sc.next();
            doanhNghiep = sc.next();
        }

        public String getDoanhNghiep() {
            return doanhNghiep;
        }

        @Override
        public int compareTo(SinhVien o) {
            return ten.compareTo(o.ten);
        }

        @Override
        public String toString() {
            return stt+" "+ma+" "+ten+" "+lop+" "+email+" "+doanhNghiep;
        }
    }

    private static class QuanLySVTT {
        ArrayList<SinhVien> list;

        public QuanLySVTT(ArrayList<SinhVien> list) {
            this.list = list;
        }

        public void locTheoDN(String dn) {
            for (SinhVien sv: list) {
                if (sv.getDoanhNghiep().equals(dn)) System.out.println(sv);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        QuanLySVTT ql = new QuanLySVTT(all);
        int q = sc.nextInt();
        for (int i=0; i<q; i++) ql.locTheoDN(sc.next());
    }
}
