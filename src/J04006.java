//J04006 KHAI BÁO LỚP SINH VIÊN

import java.util.Scanner;

public class J04006 {
    static Integer code = 1;
    static class Student {
        private String msv = "B20DCCN";
        private String ten;
        private String maLop;
        private String ngaySinh;
        private float diem;
        public Student(String ten, String maLop, String ngaySinh, float diem){
            this.ten = ten;
            this.maLop = maLop;
            this.ngaySinh = process_format_date(ngaySinh);
            this.diem = diem;
            this.msv += process_code();
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
        public String process_code(){
            String ma;
            if (code < 10) ma = "00" + code.toString();
            else if (code < 100) ma = "0" + code.toString();
            else ma = code.toString();
            code++;
            return ma;
        }
        @Override
        public String toString(){
            return msv+" "+ten+" "+maLop+" "+ngaySinh+" "+String.format("%.2f", diem);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(
                scanner.nextLine(),
                scanner.next(),
                scanner.next(),
                scanner.nextFloat()
                );
        System.out.println(student);
    }
}
