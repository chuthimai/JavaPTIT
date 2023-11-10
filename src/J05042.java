//J05042 BẢNG XẾP HẠNG

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05042 {
    private static class SinhVien implements Comparable<SinhVien>{
        private String ten;
        private int baiDung, submit;

        public SinhVien(Scanner sc){
            sc.nextLine();
            ten = sc.nextLine();
            baiDung = sc.nextInt();
            submit = sc.nextInt();
        }

        @Override
        public String toString() {
            return ten+" "+baiDung+" "+submit;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (baiDung == o.baiDung) return Integer.compare(submit, o.submit);
            else return Integer.compare(o.baiDung, baiDung);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        for (SinhVien sv: all) System.out.println(sv);
    }
}
