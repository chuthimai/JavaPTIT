//J07053 XÉT TUYỂN

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07053 {
    private static String chuanHoa(String name){
        String res = "";
        name = name.trim();
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for (String c: arr) {
            res += c.substring(0, 1).toUpperCase() + c.substring(1) + " ";
        }
        return res;
    }

    private static class NguoiXetTuyen {
        private static int sMa = 1;
        private String ma, ten, ngaySinh;
        private int tuoi;
        private double lyThuyet, thucHanh, diemTB, diemThuong;

        public NguoiXetTuyen(Scanner sc){
            ma = "PH" + String.format("%02d", sMa++);
            ten = chuanHoa(sc.nextLine());
            ngaySinh = sc.nextLine();
            tuoi = 2021 - Integer.parseInt(ngaySinh.split("/")[2]);
            lyThuyet = Double.parseDouble(sc.nextLine());
            thucHanh = Double.parseDouble(sc.nextLine());
            diemThuong = getDiemThuong();
            diemTB = getDiemTB();
        }

        public double getDiemTB() {
            diemTB = Math.round((lyThuyet + thucHanh)/2 + diemThuong);
            if (diemTB >= 10) diemTB = 10;
            return diemTB;
        }

        public double getDiemThuong() {
            if (lyThuyet >= 8 && thucHanh >= 8) diemThuong = 1;
            else if (lyThuyet >= 7.5 && thucHanh >= 7.5) diemThuong = 0.5;
            return diemThuong;
        }

        @Override
        public String toString() {
            String res =  ma+" "+ten+" "+tuoi+" "+(int) diemTB+" ";
            if (diemTB >= 9) res += "Xuat sac";
            else if (diemTB >= 8) res += "Gioi";
            else if (diemTB >= 7) res += "Kha";
            else if (diemTB >= 5) res += "Trung binh";
            else res += "Truot";
            return res;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("XETTUYEN.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++) {
            System.out.println(new NguoiXetTuyen(sc));
        }

    }
}
