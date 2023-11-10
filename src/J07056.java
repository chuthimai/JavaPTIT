//J07056 TÍNH TIỀN ĐIỆN

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07056 {
    private static String processName(String name){
        name = name.toLowerCase();
        String[] allElement = name.split("\\s+");
        String res = "";
        for (String s: allElement) res += s.substring(0, 1).toUpperCase()+s.substring(1)+" ";
        return res;
    }
    public static class KhachHang implements Comparable<KhachHang>{
        private static int sMa = 1;
        private String ma, ten, loaiHoGD;
        private int soDau, soCuoi, dinhMuc, soDien;
        private double tienTrongDM, tienVuotDM, thue, tong;

        public KhachHang(Scanner sc){
            sc.nextLine();
            ma = "KH" + String.format("%02d", sMa++);
            ten = processName(sc.nextLine().trim());
            loaiHoGD = sc.next();
            setDinhMuc();
            soDau = sc.nextInt();
            soCuoi = sc.nextInt();
            soDien = soCuoi - soDau;
            setTienTrongDM();
            setTienVuotDM();
            setThue();
            setTong();
        }

        public void setDinhMuc() {
            if (loaiHoGD.equals("A")) dinhMuc = 100;
            else if (loaiHoGD.equals("B")) dinhMuc = 500;
            else if (loaiHoGD.equals("C")) dinhMuc = 200;
        }

        public void setTienTrongDM() {
            if (soDien > dinhMuc) tienTrongDM = dinhMuc*450;
            else tienTrongDM = soDien*450;
        }

        public void setTienVuotDM() {
            if (soDien - dinhMuc <= 0) tienVuotDM = 0;
            else tienVuotDM = (soDien - dinhMuc)*1000;
        }

        public void setThue() {
            thue = tienVuotDM/20;
        }

        public void setTong() {
            tong = tienTrongDM + tienVuotDM + thue;
        }

        @Override
        public String toString() {
            return ma+" "+ten+(int) tienTrongDM+" "+(int) tienVuotDM+" "+(int) thue+" "+(int) tong;
        }

        @Override
        public int compareTo(KhachHang o) {
            return Double.compare(o.tong, tong);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("KHACHHANG.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        ArrayList<KhachHang> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new KhachHang(sc));
        Collections.sort(all);
        for (KhachHang khachHang: all) System.out.println(khachHang);
    }
}
