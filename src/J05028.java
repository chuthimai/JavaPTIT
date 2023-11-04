//J05028 DANH SÁCH DOANH NGHIỆP NHẬN SINH VIÊN THỰC TẬP - 1


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05028 {
    private static class DoanhNghiep implements Comparable<DoanhNghiep>{
        private String ma, ten;
        private int soSV;

        public DoanhNghiep(Scanner sc) {
            ma = sc.next();
            sc.nextLine();
            ten = sc.nextLine();
            soSV = sc.nextInt();
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new DoanhNghiep(sc));
        Collections.sort(all);
        for (DoanhNghiep dn: all) System.out.println(dn);
    }
}
