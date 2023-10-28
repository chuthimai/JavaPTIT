//J07018 CHUẨN HÓA DANH SÁCH SINH VIÊN

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07018 {
    private static String chuanHoa(String name) {
        String res = "";
        name = name.trim();
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for (String c : arr) {
            res += c.substring(0, 1).toUpperCase() + c.substring(1) + " ";
        }
        return res.trim();
    }

    private static String formatDate(String date) {
        String[] arr = date.split("/");
        return String.format("%02d/%02d/%04d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }

    private static class SinhVien {
        private static int sMa = 1;
        private String MSV, ten, lop, ngaySinh;
        private double diemGPA;

        public SinhVien(String ten, String lop, String ngaySinh, double diemGPA) {
            MSV = "B20DCCN" + String.format("%03d", sMa++);
            this.ten = chuanHoa(ten);
            this.lop = lop;
            this.ngaySinh = formatDate(ngaySinh);
            this.diemGPA = diemGPA;
        }

        @Override
        public String toString() {
            return MSV + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", diemGPA);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SINHVIEN.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diemGPA = Double.parseDouble(sc.nextLine());

            SinhVien sinhVien = new SinhVien(ten, lop, ngaySinh, diemGPA);
            System.out.println(sinhVien);
        }
    }
}
