//J05045 SẮP XẾP NHÂN VIÊN THEO THU NHẬP

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05045 {
    private static int round(int num, int digit){
        int r = num % (int) Math.pow(10, digit);
        if (r >= 5*(int) Math.pow(10, digit-1)) return (num / (int) Math.pow(10, digit) + 1) * (int) Math.pow(10, digit);
        else return (num / (int) Math.pow(10, digit)) * (int) Math.pow(10, digit);
    }
    private static class NhanVien {
        private static int sMa = 1;
        private String ma, ten, chucVu;
        private int luongNgay, ngayCong, luongChinh, phuCapCV, tamUng, thucLinh;

        public NhanVien(Scanner sc){
            ma = "NV" + String.format("%02d", sMa++);
            sc.nextLine();
            ten = sc.nextLine();
            chucVu = sc.next();
            luongNgay = sc.nextInt();
            ngayCong = sc.nextInt();
            setLuongChinh();
            setPhuCapCV();
            setTamUng();
            setThucLinh();

        }

        public void setLuongChinh() {
            luongChinh = luongNgay*ngayCong;
        }

        public void setTamUng() {
            tamUng = round(luongChinh * 2/3, 3);
            if (tamUng > 25000) tamUng = 25000;
        }

        public void setPhuCapCV() {
            if (chucVu.equals("GD")) phuCapCV = 500;
            else if (chucVu.equals("PGD")) phuCapCV = 400;
            else if (chucVu.equals("TP")) phuCapCV = 300;
            else if (chucVu.equals("KT")) phuCapCV = 250;
            else phuCapCV = 100;
        }

        public void setThucLinh() {
            thucLinh = luongChinh - tamUng + phuCapCV;
        }

        public int getThuNhap() {
            return luongChinh + phuCapCV;
        }

        public String getMa() {
            return ma;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+phuCapCV+" "+luongChinh+" "+tamUng+" "+thucLinh;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new NhanVien(sc));
        all.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getThuNhap() == o2.getThuNhap()) return o1.getMa().compareTo(o2.getMa());
                else return Integer.compare(o2.getThuNhap(), o1.getThuNhap());
            }
        });
        for (NhanVien nhanVien: all) System.out.println(nhanVien);
    }
}
