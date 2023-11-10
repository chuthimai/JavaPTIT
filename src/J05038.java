//J05038 BẢNG KÊ TIỀN LƯƠNG

import java.util.Scanner;

public class J05038 {
    private static class NhanVien {
        private static int sMa = 1;
        private String ma, ten, chucVu;
        private int luongNgay, ngayCong, luongThang, thuong, phuCapCV, thucLinh;

        public NhanVien(Scanner sc){
            ma = "NV" + String.format("%02d", sMa++);
            sc.nextLine();
            ten = sc.nextLine();
            luongNgay = sc.nextInt();
            ngayCong = sc.nextInt();
            chucVu = sc.next();
            setLuongThang();
            setThuong();
            setPhuCapCV();
            setThucLinh();
        }

        public void setLuongThang() {
            luongThang = luongNgay*ngayCong;
        }

        public void setThuong() {
            if (ngayCong >= 25) thuong = luongThang/5;
            else if (ngayCong >= 22) thuong = luongThang/10;
            else thuong = 0;
        }

        public void setPhuCapCV() {
            if (chucVu.equals("GD")) phuCapCV = 250000;
            else if (chucVu.equals("PGD")) phuCapCV = 200000;
            else if (chucVu.equals("TP")) phuCapCV = 180000;
            else if (chucVu.equals("NV")) phuCapCV = 150000;
        }

        public void setThucLinh() {
            thucLinh = luongThang + thuong + phuCapCV;
        }

        public int getThucLinh() {
            return thucLinh;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+luongThang+" "+thuong+" "+phuCapCV+" "+thucLinh;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chiPhi = 0;
        for (int i=0; i<n; i++){
            NhanVien nhanVien = new NhanVien(sc);
            chiPhi += nhanVien.getThucLinh();
            System.out.println(nhanVien);
        }
        System.out.println("Tong chi phi tien luong: "+chiPhi);
    }
}
