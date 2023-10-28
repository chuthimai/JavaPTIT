//J05011 TÍNH GIỜ

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class J05011 {
    private static class NguoiChoi {
        private String ma, ten;
        private SimpleDateFormat f = new SimpleDateFormat("hh:mm");
        private Date gioVao, gioRa;
        private long gio, phut, time;

        public NguoiChoi(Scanner sc) throws ParseException {
            ma = sc.nextLine();
            ten = sc.nextLine();
            gioVao = f.parse(sc.nextLine());
            gioRa = f.parse(sc.nextLine());
            time = gioRa.getTime() - gioVao.getTime();
            gio = time/1000/60/60;
            phut = (time/1000/60) % 60;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gio+" gio "+phut+" phut";
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NguoiChoi> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new NguoiChoi(sc));
        all.sort(new Comparator<NguoiChoi>() {
            @Override
            public int compare(NguoiChoi o1, NguoiChoi o2) {
                return Long.compare(o2.time, o1.time);
            }
        });
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
