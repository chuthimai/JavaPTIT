//J05032 TRẺ NHẤT – GIÀ NHẤT

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05032 {
    private static class Human implements Comparable<Human>{
        private String ten;
        private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        private Date ngaySinh;

        public Human(Scanner sc){
            ten = sc.next();
            try {
                ngaySinh = f.parse(sc.next());
            } catch (ParseException e) {
                System.out.println(e);
            }
        }

        @Override
        public String toString() {
            return ten;
        }

        @Override
        public int compareTo(Human o) {
            return Long.compare(ngaySinh.getTime(), o.ngaySinh.getTime());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Human> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new Human(sc));
        Collections.sort(all);
        System.out.println(all.get(n-1));
        System.out.println(all.get(0));
    }
}
