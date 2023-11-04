//J05021 SẮP XẾP THEO MÃ SINH VIÊN

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05021 {
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
            return ma.compareTo(o.ma);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+email;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        while (sc.hasNext()) arr.add(new SinhVien(sc));
        Collections.sort(arr);
        for (SinhVien sv:arr) System.out.println(sv);
    }
}
