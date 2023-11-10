//J05041 SẮP XẾP BẢNG TÍNH CÔNG

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05041 {
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
        ArrayList<NhanVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new NhanVien(sc));
        all.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Integer.compare(o2.getThucLinh(), o1.getThucLinh());
            }
        });
        for (NhanVien nv: all) System.out.println(nv);
    }
}
