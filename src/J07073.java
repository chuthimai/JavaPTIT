//J07073 ĐĂNG KÝ HÌNH THỨC GIẢNG DẠY

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07073 {
    private static class MonHoc implements Comparable<MonHoc>{
        private String ma, tenMH, hinhThucLT, hinhThucTH;
        private int soTin;

        public MonHoc(Scanner sc){
            ma = sc.nextLine();
            tenMH = sc.nextLine();
            soTin = Integer.parseInt(sc.nextLine());
            hinhThucLT = sc.nextLine();
            hinhThucTH = sc.nextLine();
        }

        public String getHinhThucTH() {
            return hinhThucTH;
        }

        @Override
        public int compareTo(MonHoc o) {
            return ma.compareTo(o.ma);
        }

        @Override
        public String toString() {
            return ma+" "+tenMH+" "+soTin+" "+hinhThucLT+" "+hinhThucTH;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> allOnline = new ArrayList<>();
        for (int i=0; i<n; i++){
            MonHoc monHoc = new MonHoc(sc);
            if (!monHoc.getHinhThucTH().equalsIgnoreCase("Truc tiep"))
                allOnline.add(monHoc);
        }
        Collections.sort(allOnline);
        for (MonHoc m: allOnline) System.out.println(m);
    }
}
