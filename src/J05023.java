//J05023 LIỆT KÊ SINH VIÊN THEO KHÓA

import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
    private static class SinhVien {
        private String ma, ten, lop, email;

        public SinhVien(Scanner sc) {
            this.ma = sc.next();
            sc.nextLine();
            this.ten = sc.nextLine();
            this.lop = sc.next();
            this.email = sc.next();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+email;
        }
    }

    private static class QLSV {
        private ArrayList<SinhVien> list;

        public QLSV(ArrayList<SinhVien> list) {
            this.list = list;
        }

        public void locTheoKhoa(String khoa){
            System.out.println("DANH SACH SINH VIEN KHOA "+khoa+":");
            for (SinhVien sv:list) {
                if (sv.lop.substring(1,3).equals(khoa.substring(2))) System.out.println(sv);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=0; i<n; i++) arr.add(new SinhVien(sc));
        int soLop = sc.nextInt();
        QLSV qlsv = new QLSV(arr);
        for (int i=0; i<soLop; i++) {
            String khoa = sc.next();
            qlsv.locTheoKhoa(khoa);
        }
    }
}
