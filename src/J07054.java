//J07054 TÍNH ĐIỂM TRUNG BÌNH

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07054 {
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

    private static class SinhVien implements Comparable<SinhVien>{
        private static int sMa = 1;
        private String ma, ten;
        private double mon1, mon2, mon3, diemTB;
        public int hang;

        public SinhVien(Scanner sc){
            ma = "SV" + String.format("%02d", sMa++);
            ten = chuanHoa(sc.nextLine());
            mon1 = Double.parseDouble(sc.nextLine());
            mon2 = Double.parseDouble(sc.nextLine());
            mon3 = Double.parseDouble(sc.nextLine());
            diemTB = (mon1*3 + mon2*3 + mon3*2)/8;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+String.format("%.2f", diemTB)+" "+hang;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (diemTB == o.diemTB) return ma.compareTo(o.ma);
            else return Double.compare(o.diemTB, diemTB);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("BANGDIEM.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++){
            if (i == 0) {
                all.get(0).hang = 1;
            }else {
                if (all.get(i).diemTB == all.get(i-1).diemTB) all.get(i).hang = all.get(i-1).hang;
                else all.get(i).hang = i+1;
            }

            System.out.println(all.get(i));
        }
    }
}
