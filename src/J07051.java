//J07051 TÍNH TIỀN PHÒNG

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class J07051 {
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

    private static class Customer{
        private static int sMa = 1;
        private String ma;
        private String ten, soPhong;
        private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        private Date ngayNhan, ngayTra;
        private int soNgay, tienDV, thanhTien;

        public Customer(Scanner sc) throws ParseException {
            ma = "KH" + String.format("%02d", sMa++);
            ten = chuanHoa(sc.nextLine());
            soPhong = sc.nextLine();
            ngayNhan = f.parse(sc.nextLine());
            ngayTra = f.parse(sc.nextLine());
            tienDV = Integer.parseInt(sc.nextLine());
            soNgay = (int) ((ngayTra.getTime()-ngayNhan.getTime())/1000/60/60/24) + 1;
            thanhTien = getThanhTien();
        }

        public int getThanhTien() {
            if (soPhong.substring(0,1).equals("1")) thanhTien = 25 * soNgay;
            else if (soPhong.substring(0,1).equals("2")) thanhTien = 34 * soNgay;
            else if (soPhong.substring(0,1).equals("3")) thanhTien = 50 * soNgay;
            else if (soPhong.substring(0,1).equals("4")) thanhTien = 80 * soNgay;
            thanhTien += tienDV;
            return thanhTien;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soPhong+" "+soNgay+" "+thanhTien;
        }
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        File f = new File("KHACHHANG.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new Customer(sc));
        all.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return Integer.compare(o2.thanhTien, o1.thanhTien);
            }
        });

        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
