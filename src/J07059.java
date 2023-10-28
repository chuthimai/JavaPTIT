//J07059 DANH SÁCH CA THI

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J07059 {
    private static class CaThi implements Comparable<CaThi>{
        private static int sMa = 1;
        private String ma, phongThi, ngayStr, gioStr;
        private SimpleDateFormat day = new SimpleDateFormat("dd/MM/yyyy"),
                time = new SimpleDateFormat("hh:mm");
        private Date ngay, gio;

        public CaThi(Scanner sc) throws ParseException {
            ma = "C" + String.format("%03d", sMa++);
            ngayStr = sc.nextLine();
            ngay = day.parse(ngayStr);
            gioStr = sc.nextLine();
            gio = time.parse(gioStr);
            phongThi = sc.nextLine();
        }

        @Override
        public String toString() {
            return ma+" "+ngayStr+" "+gioStr+" "+phongThi;
        }

        @Override
        public int compareTo(CaThi o) {
            if (ngay.getTime() == o.ngay.getTime()) {
                if (gio.getTime() == o.gio.getTime()) return ma.compareTo(o.ma);
                else return Long.compare(gio.getTime(), o.gio.getTime());
            }else return Long.compare(ngay.getTime(), o.ngay.getTime());
        }
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        File f = new File("CATHI.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new CaThi(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
