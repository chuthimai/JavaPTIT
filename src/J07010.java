//J07010 DANH SÁCH SINH VIÊN TRONG FILE - 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J07010 {
    static class SinhVien{
        static int sMa = 1;
        private String ma, ten, ngaySinh, lop;
        private Double diem;
        public SinhVien(Scanner sc){
            ma = "B20DCCN" + String.format("%03d", sMa++);
            ten = sc.nextLine();
            lop = sc.nextLine().toUpperCase();
            ngaySinh = process_format_date(sc.nextLine());
            diem = Double.parseDouble(sc.nextLine());
        }
        public static String process_format_date(String date){
            String[] reg = {"^\\d{2}/\\d{2}/\\d{4}$", "^\\d/\\d/\\d{4}$", "^\\d{2}/\\d/\\d{4}$", "^\\d/\\d{2}/\\d{4}$"};
            if (date.matches(reg[1])){
                date = "0" + date.substring(0, 2) + "0" + date.substring(2);
            } else if (date.matches(reg[2])){
                date = date.substring(0, 3) + "0" + date.substring(3);
            } else if (date.matches(reg[3])){
                date = "0" + date;
            }
            return date;
        }
        @Override
        public String toString(){
            return ma+" "+ten+" "+lop+" "+ngaySinh+" "+String.format("%.2f", diem);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SV.in");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<SinhVien> all = new ArrayList<>();
        for (int i=0; i<n; i++){
            all.add(new SinhVien(scanner));
        }
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
