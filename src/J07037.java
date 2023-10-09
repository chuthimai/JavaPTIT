//J07037 DANH SÁCH DOANH NGHIỆP

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07037 {
    private static class DoanhNghiep implements Comparable<DoanhNghiep>{
        private String ma, ten;
        private int soSV;
        private DoanhNghiep(Scanner sc){
            ma = sc.nextLine();
            ten = sc.nextLine();
            soSV = Integer.parseInt(sc.nextLine());
        }

        @Override
        public int compareTo(DoanhNghiep o) {
            return ma.compareTo(o.ma);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soSV;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DN.in");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<DoanhNghiep> all = new ArrayList<>();
        for (int i=0; i<n; i++){
            all.add(new DoanhNghiep(scanner));
        }
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
