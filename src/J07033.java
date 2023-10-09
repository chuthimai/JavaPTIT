//J07033 DANH SÁCH SINH VIÊN TRONG FILE - 1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07033 {
    static class SinhVien implements Comparable<SinhVien>{
        private String ma, ten, lop, email;
        public SinhVien(Scanner sc){
            ma = sc.nextLine();
            ten = processName(sc.nextLine().trim());
            lop = sc.nextLine().toUpperCase();
            email = sc.nextLine();
        }
        private String processName(String name){
            name = name.toLowerCase();
            String[] allElement = name.split("\\s+");
            String res = "";
            for (String s: allElement) res += s.substring(0, 1).toUpperCase()+s.substring(1)+" ";
            return res;
        }
        @Override
        public String toString(){
            return ma+" "+ten+lop+" "+email;
        }

        @Override
        public int compareTo(SinhVien o) {
            return ma.compareTo(o.ma);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SINHVIEN.in");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++){
            all.add(new SinhVien(scanner));
        }
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
