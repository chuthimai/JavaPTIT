//J05024 LIỆT KÊ SINH VIÊN THEO NGÀNH

import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
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

        private String maNganh(String nganh) {
            String res = "";
            if (nganh.equals("ke toan")) res = "KT";
            else if (nganh.equals("cong nghe thong tin")) res = "DCCN";
            else if (nganh.equals("an toan thong tin")) res = "DCAT";
            else if (nganh.equals("vien thong")) res = "DCVT";
            else if (nganh.equals("dien tu")) res = "DCDT";
            return res;
        }

        public void locTheoNganh(String nganh){
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh.toUpperCase().trim()+":");
            nganh = maNganh(nganh.toLowerCase().trim());
            for (SinhVien sv:list) {
                if (nganh.equals("DCCN") || nganh.equals("DCAT")) {
                    if (sv.ma.contains(nganh) && !sv.lop.startsWith("E") ) System.out.println(sv);
                }else {
                    if (sv.ma.contains(nganh)) System.out.println(sv);
                }
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
        sc.nextLine();
        for (int i=0; i<soLop; i++) {
            String nganh = sc.nextLine().toLowerCase();
            qlsv.locTheoNganh(nganh);
        }
    }
}
