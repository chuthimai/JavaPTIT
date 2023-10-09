//J07058 DANH SÁCH MÔN THI

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07058 {
    static class MonThi implements Comparable<MonThi>{
        private String ma, ten, hinhThucThi;
        public MonThi(Scanner sc){
            ma = sc.nextLine();
            ten = sc.nextLine();
            hinhThucThi = sc.nextLine();
        }

        @Override
        public int compareTo(MonThi o) {
            return ma.compareTo(o.ma);
        }

        @Override
        public String toString(){
            return ma+" "+ten+" "+hinhThucThi;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<MonThi> allMonThi = new ArrayList<>();
        for (int i=0; i<n; i++){
            allMonThi.add(new MonThi(scanner));
        }
        Collections.sort(allMonThi);
        for (int i=0; i<n; i++) System.out.println(allMonThi.get(i));
    }
}
