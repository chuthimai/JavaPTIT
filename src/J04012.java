//J04012 BÀI TOÁN TÍNH CÔNG

import java.util.Scanner;

public class J04012 {
    private static class Nhanvien {
        private String ma = "NV01", ten, chucVu;
        private int luongCB, ngayCong, luongThang, thuong, phuCap, thuNhap;

        public Nhanvien(Scanner sc) {
            ten = sc.nextLine();
            luongCB = sc.nextInt();
            ngayCong = sc.nextInt();
            chucVu = sc.next();
            tinhLuong();
        }

        private void tinhLuong() {
            luongThang = getLuongThang();
            thuong = getThuong();
            phuCap = getPhuCap();
            thuNhap = getThuNhap();
        }

        public int getLuongThang() {
            luongThang = luongCB * ngayCong;
            return luongThang;
        }

        public int getThuong() {
            if (ngayCong >= 25) thuong = luongThang*20/100;
            else if (ngayCong >= 22) thuong = luongThang*10/100;
            else thuong = 0;
            return thuong;
        }

        public int getPhuCap() {
            if (chucVu.equals("GD")) phuCap = 250000;
            else if (chucVu.equals("PGD")) phuCap = 200000;
            else if (chucVu.equals("TP")) phuCap = 180000;
            else if (chucVu.equals("NV")) phuCap = 150000;
            return phuCap;
        }

        public int getThuNhap() {
            thuNhap = luongThang + thuong + phuCap;
            return thuNhap;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+luongThang+" "+thuong+" "+phuCap+" "+thuNhap;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien nv = new Nhanvien(sc);
        System.out.println(nv);
    }
}
