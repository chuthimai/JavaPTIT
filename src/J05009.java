//J05009 TÌM THỦ KHOA CỦA KỲ THI

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05009 {

    private static class SinhVien implements Comparable<SinhVien>{
        private static int sMa = 1;
        private String ten, ngaySinh;
        private double mon1, mon2, mon3, sum;
        public int hang, ma;

        public SinhVien(Scanner sc){
            ma = sMa++;
            ten = sc.nextLine();
            ngaySinh = sc.nextLine();
            mon1 = Double.parseDouble(sc.nextLine());
            mon2 = Double.parseDouble(sc.nextLine());
            mon3 = Double.parseDouble(sc.nextLine());
            sum = mon1 + mon2 + mon3;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+ngaySinh+" "+sum;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (sum == o.sum) return Integer.compare(ma, o.ma);
            else return Double.compare(o.sum, sum);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        System.out.println(all.get(0));
        for (int i=1; i<n; i++) {
            if (all.get(i).sum == all.get(i-1).sum) System.out.println(all.get(i));
            else break;
        }
    }

}
