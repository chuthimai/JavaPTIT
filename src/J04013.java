//J04013 BÀI TOÁN TUYỂN SINH

import java.util.Scanner;

public class J04013 {
    private static class ThiSinh {
        private String ma, ten;
        private double toan, ly, hoa, diemUT, tongDiem;

        public ThiSinh(Scanner sc){
            ma = sc.nextLine();
            ten = sc.nextLine();
            toan = sc.nextDouble();
            ly = sc.nextDouble();
            hoa = sc.nextDouble();
            diemUT = getDiemUT();
            tongDiem = getTongDiem();

        }

        public double getDiemUT() {
            if (ma.substring(0, 3).equals("KV1")) diemUT = 0.5;
            else if (ma.substring(0, 3).equals("KV2")) diemUT = 1;
            else if (ma.substring(0, 3).equals("KV3")) diemUT = 2.5;
            return diemUT;
        }

        public double getTongDiem() {
            tongDiem = toan*2 + ly + hoa;
            return tongDiem;
        }

        @Override
        public String toString() {
            String res = ma+" "+ten+" ";
            if (diemUT == (int) diemUT) res += (int) diemUT+" ";
            else res += String.format("%.1f ", diemUT);
            if (tongDiem == (int) tongDiem) res += (int) tongDiem+" ";
            else res += String.format("%.1f ", tongDiem);
            if (tongDiem+diemUT >= 24) res += "TRUNG TUYEN";
            else res += "TRUOT";
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc);
        System.out.println(ts);
    }
}
