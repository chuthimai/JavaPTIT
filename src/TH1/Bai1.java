package TH1;

import java.util.Scanner;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);
    public static class Sinhvien {
        private String msv;
        private String name;
        private boolean gioiTinh;
        private double diem;
        public void input(){
            msv = scanner.nextLine().toUpperCase();
            name = scanner.nextLine();
            gioiTinh = scanner.nextBoolean();
            diem = scanner.nextDouble();
        }
        public void out(){
            String s = "";
            if (gioiTinh) s = "nam";
            else s = "nu";
            String dat = "";
            if (diem>=5) dat = "dat";
            else dat="hoc lai";
            System.out.println(msv+" "+name+" "+s+" "+dat);
        }
    }
    public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}
