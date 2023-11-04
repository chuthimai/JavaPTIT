//J05025 SẮP XẾP DANH SÁCH GIẢNG VIÊN

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {
    private static class GiangVien implements Comparable<GiangVien>{
        private static int sMa = 1;
        private String ma, ten, boMon;
        public GiangVien(Scanner sc) {
            ma = "GV"+String.format("%02d", sMa++);
            ten = sc.nextLine();
            boMon = maBoMon(sc.nextLine());
        }
        public String maBoMon(String mon){
            String res = "";
            String[] arr = mon.split("\\s+");
            for (String str:arr) res += str.substring(0, 1).toUpperCase();
            return res;
        }

        public String getTen(String name) {
            String[] arr = name.split("\\s+");
            return arr[arr.length-1];
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+boMon;
        }

        @Override
        public int compareTo(GiangVien o) {
            if (getTen(ten).equals(getTen(o.ten))) return ma.compareTo(o.ma);
            else return getTen(ten).compareTo(getTen(o.ten));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new GiangVien(sc));
        Collections.sort(all);
        for (GiangVien gv: all) System.out.println(gv);
    }
}
