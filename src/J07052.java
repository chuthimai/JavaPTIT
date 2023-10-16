//J07052 DANH SÁCH TRÚNG TUYỂN

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07052 {
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

    private static class ThiSinh implements Comparable<ThiSinh>{
        public static double diemChuan;
        private String ma, ten;
        private double toan, ly, hoa, diemUT, tongDiem;

        public ThiSinh(Scanner sc){
            sc.nextLine();
            ma = sc.nextLine();
            ten = chuanHoa(sc.nextLine());
            toan = sc.nextDouble();
            ly = sc.nextDouble();
            hoa = sc.nextDouble();
            diemUT = getDiemUT();
            tongDiem = getTongDiem();

        }

        public double getDiemUT() {
            if (ma.substring(0, 3).equals("KV1")) diemUT = 0.5;
            else if (ma.substring(0, 3).equals("KV2")) diemUT = 1;
            else if (ma.substring(0, 3).equals("KV3")) diemUT = 2.5;
            return diemUT;
        }

        public double getTongDiem() {
            tongDiem = toan*2 + ly + hoa + getDiemUT();
            return tongDiem;
        }

        @Override
        public String toString() {
            String res = ma+" "+ten+" ";
            if (diemUT == (int) diemUT) res += (int) diemUT+" ";
            else res += String.format("%.1f ", diemUT);
            if (tongDiem == (int) tongDiem) res += (int) tongDiem+" ";
            else res += String.format("%.1f ", tongDiem);
            if (tongDiem >= diemChuan) res += "TRUNG TUYEN";
            else res += "TRUOT";
            return res;
        }

        @Override
        public int compareTo(ThiSinh o) {
            if (o.tongDiem == tongDiem) return ma.compareTo(o.ma);
            else return Double.compare(o.tongDiem, tongDiem);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("THISINH.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        ArrayList<ThiSinh> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new ThiSinh(sc));
        int chiTieu = sc.nextInt();
        Collections.sort(all);
        ThiSinh.diemChuan = all.get(chiTieu-1).tongDiem;
        System.out.println(String.format("%.1f", ThiSinh.diemChuan));
        for (int i=0; i<n; i++){
            System.out.println(all.get(i));
        }
    }
}
