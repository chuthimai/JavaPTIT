//J07038 DANH SÁCH THỰC TẬP - 3

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07038 {
    private static ArrayList<SinhVien> allSV = new ArrayList<>();
    private static ArrayList<DoanhNghiep> allDN = new ArrayList<>();

    private static String chuanHoa(String name){
        String res = "";
        name = name.trim();
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for (String c: arr) {
            res += c.substring(0, 1).toUpperCase() + c.substring(1) + " ";
        }
        return res;
    }

    private static class SinhVien {
        private String ma, ten, lop, email;

        public SinhVien(Scanner sc) {
            ma = sc.next();
            sc.nextLine();
            ten = chuanHoa(sc.nextLine());
            lop = sc.next();
            email = sc.next();
        }

        public String getMa() {
            return ma;
        }

        @Override
        public String toString() {
            return ma+" "+ten+lop;
        }
    }

    private static class DoanhNghiep {
        private String ma, ten;
        private int soSV;

        public DoanhNghiep() {

        }

        public DoanhNghiep(Scanner sc) {
            ma = sc.next();
            sc.nextLine();
            ten = sc.nextLine();
            soSV = sc.nextInt();
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public int getSoSV() {
            return soSV;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soSV;
        }
    }

    private static class ThucTap {
        private String maSV, maDN;

        public ThucTap(String maSV, String maDN) {
            this.maSV = maSV;
            this.maDN = maDN;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof ThucTap)) return false;
            ThucTap o = (ThucTap) obj;
            return o.maSV.equals(maSV) && o.maDN.equals(maDN);
        }
    }

    private static class QuanLySVTT {
        private ArrayList<ThucTap> list;

        public QuanLySVTT(ArrayList<ThucTap> list) {
            this.list = list;
        }

        public void locSV(String maDN) {
            DoanhNghiep dn = new DoanhNghiep();
            for (DoanhNghiep doanhNghiep: allDN) {
                if (doanhNghiep.getMa().equals(maDN)) {
                    dn = doanhNghiep;
                    break;
                }
            }
            int soSVnhan = dn.getSoSV();
            System.out.println("DANH SACH THUC TAP TAI "+dn.getTen()+":");

            for (SinhVien sv: allSV) {
                if (soSVnhan == 0) break;
                if (list.contains(new ThucTap(sv.getMa(), maDN))) {
                    System.out.println(sv);
                    soSVnhan --;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fSV = new File("SINHVIEN.in");
        File fDN = new File("DN.in");
        File fTT = new File("THUCTAP.in");
        Scanner scSV = new Scanner(fSV);
        Scanner scDN = new Scanner(fDN);
        Scanner scTT = new Scanner(fTT);
        int n;

//        Nhap Sinh vien
        n = scSV.nextInt();
        for (int i=0; i<n; i++) allSV.add(new SinhVien(scSV));
        allSV.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });

//        Nhap Doanh nghiep
        n = scDN.nextInt();
        for (int i=0; i<n; i++) allDN.add(new DoanhNghiep(scDN));

//        Nhap Thuc tap
        ArrayList<ThucTap> arrTT = new ArrayList<>();
        n = scTT.nextInt();
        for (int i=0; i<n; i++) arrTT.add(new ThucTap(scTT.next(), scTT.next()));
        QuanLySVTT ql = new QuanLySVTT(arrTT);

        n = scTT.nextInt();
        for (int i=0; i<n; i++) ql.locSV(scTT.next());
    }

}
