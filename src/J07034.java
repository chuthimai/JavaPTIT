//J07034 DANH SÁCH MÔN HỌC

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07034 {
    static class MonHoc implements Comparable<MonHoc>{
        private String ma, ten, soTin;
        public MonHoc(Scanner sc){
            ma = sc.nextLine();
            ten = sc.nextLine();
            soTin = sc.nextLine();
        }

        @Override
        public int compareTo(MonHoc o) {
            return ten.compareTo(o.ten);
        }

        @Override
        public String toString(){
            return ma+" "+ten+" "+soTin;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<MonHoc> allMonHoc = new ArrayList<>();
        for (int i=0; i<n; i++){
            allMonHoc.add(new MonHoc(scanner));
        }
        Collections.sort(allMonHoc);
        for (int i=0; i<n; i++) System.out.println(allMonHoc.get(i));
    }
}
