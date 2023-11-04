//J05027 TÌM KIẾM GIẢNG VIÊN

import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
    private static class GiangVien {
        private static int sMa = 1;
        private String ma, ten, boMon;
        public GiangVien(Scanner sc) {
            ma = "GV"+String.format("%02d", sMa++);
            ten = sc.nextLine();
            boMon = maBoMon(sc.nextLine());
        }
        public static String maBoMon(String mon){
            String res = "";
            String[] arr = mon.split("\\s+");
            for (String str:arr) res += str.substring(0, 1).toUpperCase();
            return res;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+boMon;
        }
    }

    private static class QuanLyGV {
        private ArrayList<GiangVien> list;

        public QuanLyGV(ArrayList<GiangVien> list) {
            this.list = list;
        }

        public void locTheoBoMon(String boMon) {
            boMon = GiangVien.maBoMon(boMon);
            System.out.println("DANH SACH GIANG VIEN BO MON "+boMon+":");
            for (GiangVien gv: list) {
                if (gv.boMon.equals(boMon)) System.out.println(gv);
            }
        }

        public void timKiem(String c) {
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+c+":");
            for (GiangVien gv: list) {
                if (gv.ten.toLowerCase().contains(c.toLowerCase()))
                    System.out.println(gv);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new GiangVien(sc));
        QuanLyGV quanLyGV = new QuanLyGV(all);
        int soBM = Integer.parseInt(sc.nextLine());
        for (int i=0; i<soBM; i++){
            quanLyGV.timKiem(sc.nextLine());
        }
    }
}
