//J07081 SẮP XẾP DANH SÁCH SINH VIÊN

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07081 {
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

    private static class HoTen implements Comparable<HoTen>{
        private String ho, tenDem="", ten;
        public HoTen(String str){
            str = chuanHoa(str);
            String[] full = str.split(" ");
            ho = full[0];
            ten = full[full.length-1];
            for (int i=1; i<full.length-1; i++) tenDem += full[i] + " ";
        }

        @Override
        public String toString() {
            return ho+" "+tenDem+ten;
        }

        @Override
        public int compareTo(HoTen o) {
            if (ten.equals(o.ten)) {
                if (ho.equals(o.ho)) return tenDem.compareTo(o.tenDem);
                else return ho.compareTo(o.ho);
            }else return ten.compareTo(o.ten);
        }
    }

    private static class SinhVien implements Comparable<SinhVien>{
        private String ma, sdt, email;
        private HoTen ten;

        public SinhVien(Scanner sc) {
            ma = sc.nextLine().trim();
            ten = new HoTen(sc.nextLine());
            sdt = sc.nextLine();
            email = sc.nextLine();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+sdt+" "+email;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (ten.toString().equals(o.ten.toString())) return ma.compareTo(o.ma);
            else return ten.compareTo(o.ten);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SinhVien(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
