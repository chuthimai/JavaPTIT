//J04015 TÍNH THU NHẬP GIÁO VIÊN

import java.util.Scanner;

public class J04015 {
    static class GiaoVien {
        private String ma;
        private String ten;
        private int luongCoBan;
        private int heSo, luong, phuCap=0;
        public GiaoVien(Scanner sc){
            ma = sc.nextLine();
            ten = sc.nextLine();
            luongCoBan = sc.nextInt();
            this.tinhLuong();
        }
        private void tinhLuong(){
            heSo = Integer.parseInt(ma.substring(2));
            luong = heSo*luongCoBan;
            if (ma.substring(0, 2).equals("HT")) phuCap = 2000000;
            else if (ma.substring(0, 2).equals("HP")) phuCap = 900000;
            else if (ma.substring(0, 2).equals("GV")) phuCap = 500000;
            luong += phuCap;
        }
        @Override
        public String toString(){
            return ma+" "+ten+" "+heSo+" "+phuCap+" "+luong;
        }
    }
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);
        GiaoVien giaoVien = new GiaoVien(scanner);
        System.out.println(giaoVien);
    }
}
