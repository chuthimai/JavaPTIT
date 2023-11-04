//J05018 BẢNG ĐIỂM HỌC SINH

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05018_WA {
    private static class HocSinh {
        private static int sMa = 1;
        private String ma, ten, loai;
        private double diemTB;
        public HocSinh(Scanner sc){
            sc.nextLine();
            ma = "HS" + String.format("%02d", sMa++);
            ten = sc.nextLine();
            double[] arr = new double[10];
            for (int i=0; i<10; i++) arr[i] = sc.nextDouble();
            double sum = 0;
            for (int i=0; i<10; i++){
                if (i<2) sum += arr[i]*2;
                else sum += arr[i];
            }
            diemTB = sum/12;
            setLoai();
        }

        public void setLoai() {
            if (diemTB >= 9) loai = "XUAT SAC";
            else if (diemTB >= 8) loai = "GIOI";
            else if (diemTB >= 7) loai = "KHA";
            else if (diemTB >= 5) loai = "TB";
            else loai = "YEU";
        }

        @Override
        public String toString() {
            if ((int) (diemTB*100) % 10 == 5 )
                return ma+" "+ten+" "+String.format("%.1f", diemTB+0.1)+" "+loai;
            else return ma+" "+ten+" "+String.format("%.1f", diemTB)+" "+loai;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> hocSinhs = new ArrayList<>();
        for (int i=0; i<n; i++) hocSinhs.add(new HocSinh(sc));
        hocSinhs.sort(new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o2.diemTB != o1.diemTB)
                    return Double.compare(o2.diemTB, o1.diemTB);
                else return o1.ma.compareTo(o2.ma);
            }
        });
        for (HocSinh i: hocSinhs) System.out.println(i);
    }
}
