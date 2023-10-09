//J07050 SẮP XẾP MẶT HÀNG

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07050 {
    private static class MatHang implements Comparable<MatHang>{
        private static int sMa = 1;
        private String ma, ten, nhom;
        private Double giaMua, giaBan, lai;

        public MatHang(Scanner sc){
            ma = "MH" + String.format("%02d", sMa++);
            ten = sc.nextLine();
            nhom = sc.nextLine();
            giaMua = Double.parseDouble(sc.nextLine());
            giaBan = Double.parseDouble(sc.nextLine());
            lai = giaBan - giaMua;
        }

        @Override
        public int compareTo(MatHang o) {
            return (int) (o.lai - lai);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+nhom+" "+String.format("%.2f", lai);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MATHANG.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> all = new ArrayList<>();
        for (int i=0; i<n; i++) all.add(new MatHang(sc));
        Collections.sort(all);
        for (int i=0; i<n; i++) System.out.println(all.get(i));
    }
}
