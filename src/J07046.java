//J07046 DANH SÁCH LƯU TRÚ

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07046 {
    private static class Customer {
        private static int sMa = 1;
        private String ma, ten;
        private String maPhong;
        private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        private long day;

        public Customer(Scanner sc) throws ParseException {
            ma = "KH" + String.format("%02d", sMa++);
            ten = sc.nextLine();
            maPhong = sc.nextLine();
            Date tu = f.parse(sc.nextLine());
            Date den = f.parse(sc.nextLine());
            day = (den.getTime() - tu.getTime())/1000/60/60/24;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+maPhong+" "+day;
        }
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        File f = new File("KHACH.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> all = new ArrayList<>();
        for (int i=0; i<n; i++){
            all.add(new Customer(sc));
        }
        all.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return Long.compare(o2.day, o1.day);
            }
        });
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
