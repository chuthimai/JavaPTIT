//J05010 SẮP XẾP DANH SÁCH MẶT HÀNG

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    private static class Item implements Comparable<Item>{
        private static int sMa = 1;
        private int ma;
        private String ten, nhomHang;
        private double giaMua, giaBan, loiNhuan;

        public Item(Scanner sc){
            ma = sMa++;
            ten = sc.nextLine();
            nhomHang = sc.nextLine();
            giaMua = Double.parseDouble(sc.nextLine());
            giaBan = Double.parseDouble(sc.nextLine());
            loiNhuan = giaBan - giaMua;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+nhomHang+" "+String.format("%.2f", loiNhuan);
        }

        @Override
        public int compareTo(Item o) {
            return Double.compare(o.loiNhuan, loiNhuan);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Item> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new Item(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
