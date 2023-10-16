//J07057 ĐIỂM TUYỂN SINH

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07057 {
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
        private static int sMa = 1;
        private String ma, ten, danToc;
        private float tongDiem, diemThi, khuVuc;

        public ThiSinh(Scanner sc){
            ma = "TS"+String.format("%02d", sMa++);
            ten = chuanHoa(sc.nextLine());
            diemThi = Float.parseFloat(sc.nextLine());
            danToc = sc.nextLine();
            khuVuc = Float.parseFloat(sc.nextLine());
            tongDiem = getTongDiem();
        }

        public float getTongDiem() {
            tongDiem = diemThi;
            if (khuVuc == 1) tongDiem += 1.5;
            else if (khuVuc == 2) tongDiem += 1;
            if (!danToc.equalsIgnoreCase("Kinh")) tongDiem += 1.5;
            return tongDiem;
        }

        @Override
        public String toString() {
            if (tongDiem >= 20.5) return ma+" "+ten+" "+String.format("%.1f", tongDiem)+" Do";
            else return ma+" "+ten+" "+String.format("%.1f", tongDiem)+" Truot";
        }

        @Override
        public int compareTo(ThiSinh o) {
            if (tongDiem == o.tongDiem) return ma.compareTo(o.ma);
            else return Float.compare(o.tongDiem, tongDiem);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("THISINH.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new ThiSinh(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
