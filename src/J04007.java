//J04007 KHAI BÁO LỚP NHÂN VIÊN

import java.util.Scanner;

public class J04007 {
    public static class NhanVien {
        private String mnv = "00001";
        private String ten;
        private String gioiTinh;
        private String ngaySinh;
        private String diaChi;
        private String maThue;
        private String ngayKyHopDong;
        public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKyHopDong){
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = process_format_date(ngaySinh);
            this.diaChi = diaChi;
            this.maThue = maThue.substring(0, 10);
            this.ngayKyHopDong = process_format_date(ngayKyHopDong);
        }
        public static String process_format_date(String date){
            String[] reg = {"^\\d{2}/\\d{2}/\\d{4}$", "^\\d/\\d/\\d{4}$", "^\\d{2}/\\d/\\d{4}$", "^\\d/\\d{2}/\\d{4}$"};
            if (date.matches(reg[1])){
                date = "0" + date.substring(0, 2) + "0" + date.substring(2);
            } else if (date.matches(reg[2])){
                date = date.substring(0, 3) + "0" + date.substring(3);
            } else if (date.matches(reg[3])){
                date = "0" + date;
            }
            return date;
        }
        @Override
        public String toString(){
            return mnv+" "+ten+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maThue+" "+ngayKyHopDong;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien(
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine()
        );
        System.out.println(nhanVien);
    }
}
