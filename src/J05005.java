//J05005 DANH SÁCH ĐỐI TƯỢNG SINH VIÊN - 3

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05005 {
    private static class SinhVien {
        private static int sMa = 1;
        private String MSV="B20DCCN", ten, ngaysinh, lop;
        private double gpa;

        public SinhVien(){

        }
        public SinhVien(Scanner sc){
            sc.nextLine();
            MSV = MSV + String.format("%03d", sMa++);
            ten = chuanHoa(sc.nextLine().trim());
            lop = sc.next();
            ngaysinh = defaultDate(sc.next());
            gpa = sc.nextDouble();
        }

        private String chuanHoa(String name){
            String res = "";
            String[] elements = name.toLowerCase().split("\\s+");
            for (String i:elements) {
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            return res;
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
            return MSV+" "+ten+lop+" "+ngaysinh+" "+String.format("%.2f", gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        for (int i=0; i<n; i++) {
            SinhVien sv = new SinhVien(sc);
            sinhViens.add(sv);
        }
        sinhViens.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o2.gpa, o1.gpa);
            }
        });

        for (SinhVien sv: sinhViens) System.out.println(sv);
    }
}
