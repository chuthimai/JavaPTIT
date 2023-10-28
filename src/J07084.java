//J07084 THỜI GIAN ONLINE LIÊN TỤC


import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class J07084 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        File file = new File("ONLINE.in");
        Scanner scanner = new Scanner(file);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> sinhViens = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (int i = 0; i < n; i++) {
            String ten = scanner.nextLine();
            Date batDau = dateFormat.parse(scanner.nextLine());
            Date ketThuc = dateFormat.parse(scanner.nextLine());
            long thoiGian = (ketThuc.getTime() - batDau.getTime()) / (60 * 1000); // Tính thời gian trong phút
            SinhVien sv = new SinhVien(ten, thoiGian);
            sinhViens.add(sv);
        }

        // Sắp xếp danh sách sinh viên theo thời gian giảm dần
        sinhViens.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.thoiGian == sv2.thoiGian) {
                    return sv1.ten.compareTo(sv2.ten);
                }
                return Long.compare(sv2.thoiGian, sv1.thoiGian);
            }
        });

        // In danh sách kết quả
        for (SinhVien sv : sinhViens) {
            System.out.println(sv.ten + " " + sv.thoiGian);
        }
    }

    static class SinhVien {
        String ten;
        long thoiGian;

        public SinhVien(String ten, long thoiGian) {
            this.ten = ten;
            this.thoiGian = thoiGian;
        }
    }
}
