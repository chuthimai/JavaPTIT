//J07055 XẾP LOẠI

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07055 {
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
        private double luyenTap, thucHanh, thi, tongKet;

        public SinhVien(Scanner sc){
            ma = "SV"+String.format("%02d", sMa++);
            ten = chuanHoa(sc.nextLine());
            luyenTap = Double.parseDouble(sc.nextLine());
            thucHanh = Double.parseDouble(sc.nextLine());
            thi = Double.parseDouble(sc.nextLine());
            tongKet = luyenTap*0.25 + thucHanh*0.35 + thi*0.4;
        }

        @Override
        public String toString(){
            String res = ma+" "+ten+" "+String.format("%.2f", tongKet)+" ";
            if (tongKet >= 8) res += "GIOI";
            else if (tongKet >=6.5) res += "KHA";
            else if (tongKet >= 5) res += "TRUNG BINH";
            else res += "KEM";
            return res;
        }

        @Override
        public int compareTo(SinhVien o) {
            return Double.compare(o.tongKet, tongKet);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("BANGDIEM.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
