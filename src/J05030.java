//J05030 BẢNG ĐIỂM THÀNH PHẦN - 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05030 {
    private static class SinhVien implements Comparable<SinhVien>{
        private String ma, ten, lop;
        private double diem1, diem2, diem3;

        public SinhVien(Scanner sc){
            ma = sc.next();
            sc.nextLine();
            ten = sc.nextLine();
            lop = sc.next();
            diem1 = sc.nextDouble();
            diem2 = sc.nextDouble();
            diem3 = sc.nextDouble();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "
                    +String.format("%.1f", diem1)+" "
                    +String.format("%.1f", diem2) +" "
                    +String.format("%.1f", diem3);
        }

        @Override
        public int compareTo(SinhVien o) {
            return ma.compareTo(o.ma);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) {
            System.out.print((i+1)+" ");
            System.out.println(all.get(i));
        }
    }
}
