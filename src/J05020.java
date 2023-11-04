//J05020 SẮP XẾP SINH VIÊN THEO LỚP

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05020 {
    private static class SinhVien implements Comparable<SinhVien> {
        private String ma, ten, lop, email;

        public SinhVien(Scanner sc) {
            this.ma = sc.next();
            sc.nextLine();
            this.ten = sc.nextLine();
            this.lop = sc.next();
            this.email = sc.next();
        }

        @Override
        public int compareTo(SinhVien o) {
            if (lop.equals(o.lop)) return ma.compareTo(o.ma);
            return lop.compareTo(o.lop);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+email;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=0; i<n; i++) arr.add(new SinhVien(sc));
        Collections.sort(arr);
        for (SinhVien sv:arr) System.out.println(sv);
    }
}
