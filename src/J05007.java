//J05007 SẮP XẾP DANH SÁCH ĐỐI TƯỢNG NHÂN VIÊN

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05007 {
    private static class NhanVien {
        private static int sMa = 1;
        private String ma, ten, gioiTinh, ngaysinh, diachi, maThue, ngaykyHD;

        public NhanVien(Scanner sc){
            ma = String.format("%05d", sMa++);
            ten = sc.nextLine();
            gioiTinh = sc.nextLine();
            ngaysinh = defaultDate(sc.nextLine());
            diachi = sc.nextLine();
            maThue = sc.nextLine();
            ngaykyHD = defaultDate(sc.nextLine());
        }

        private String defaultDate(String date){
            String res;
            String[] elements = date.split("/");
            res = String.format("%02d/%02d/%04d",
                    Integer.parseInt(elements[0]),
                    Integer.parseInt(elements[1]),
                    Integer.parseInt(elements[2])
            );
            return res;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gioiTinh+" "+ngaysinh+" "+diachi+" "+maThue+" "+ngaykyHD;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        for (int i=0; i<n; i++) {
            NhanVien nv = new NhanVien(sc);
            nhanViens.add(nv);
        }

        nhanViens.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    return Long.compare(f.parse(o1.ngaysinh).getTime(), f.parse(o2.ngaysinh).getTime());
                } catch (ParseException e) {
                    System.out.println(e);
                }
                return 0;
            }
        });

        for (NhanVien nv:nhanViens) System.out.println(nv);
    }
}
