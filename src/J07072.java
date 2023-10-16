//J07072 CHUẨN HÓA VÀ SẮP XẾP

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07072 {
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

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DANHSACH.in");
        Scanner sc = new Scanner(f);
        ArrayList<HoTen> all = new ArrayList<>();
        while (sc.hasNextLine()) {
            all.add(new HoTen(sc.nextLine()));
        }
        Collections.sort(all);
        for (HoTen h: all) System.out.println(h);
    }
}
