//J05043 TÍNH THU NHẬP CHO NHÂN VIÊN

import java.util.Scanner;

public class J05043 {
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

        public int getThucLinh() {
            return thucLinh;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+phuCapCV+" "+luongChinh+" "+tamUng+" "+thucLinh;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) System.out.println(new NhanVien(sc));
    }
}
