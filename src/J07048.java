//J07048 DANH SÁCH SẢN PHẨM – 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07048 {
    private static class SanPham implements Comparable<SanPham>{
        private String ma, ten;
        private int gia, baoHanh;

        @Override
        public String toString() {
            return ma+" "+ten+" "+gia+" "+baoHanh;
        }

        public SanPham(Scanner sc) {
            ma = sc.nextLine();
            ten = sc.nextLine();
            gia = Integer.parseInt(sc.nextLine());
            baoHanh = Integer.parseInt(sc.nextLine());
        }

        @Override
        public int compareTo(SanPham o) {
            if (o.gia - gia != 0) return o.gia - gia;
            else return ma.compareTo(o.ma);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SANPHAM.in");
        Scanner scanner = new Scanner(file);
        int n = Integer.parseInt(scanner.nextLine());
        List<SanPham> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new SanPham(scanner));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
