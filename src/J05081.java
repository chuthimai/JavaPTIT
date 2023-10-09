//J05081 DANH SÁCH MẶT HÀNG

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J05081 {
    static class Item implements Comparable<Item>{
        static int sMa = 1;
        private String ma, ten;
        private String donVi;
        private Integer giaMua, giaBan, lai;
        public Item(Scanner sc){
            ma = "MH" + String.format("%03d", sMa++);
            ten = sc.nextLine();
            donVi = sc.nextLine();
            giaMua = Integer.parseInt(sc.nextLine());
            giaBan = Integer.parseInt(sc.nextLine());
            lai = giaBan - giaMua;
        }

        @Override
        public int compareTo(Item o) {
            if (o.lai-lai != 0) return o.lai-lai;
            return Integer.parseInt(ma.substring(2)) - Integer.parseInt(o.ma.substring(2));
        }

        @Override
        public String toString(){
            return ma+" "+ten+" "+donVi+" "+giaMua+" "+giaBan+" "+lai;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Item> allItem = new ArrayList<>();
        for (int i=0; i<n; i++){
            allItem.add(new Item(scanner));
        }
        Collections.sort(allItem);
        for (int i=0; i<n; i++) System.out.println(allItem.get(i));
    }
}
