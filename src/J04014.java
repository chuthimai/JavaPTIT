// J04014 TÍNH TOÁN PHÂN SỐ

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long i = 0; i < n; i++) {
            PhanSo A = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo B = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo C = A.add(B);
            C = C.mul(C);
            PhanSo D = A.mul(B.mul(C));
            System.out.println(C + " " + D);
        }
    }

    private static class PhanSo {
        private long tu, mau;

        public PhanSo(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
            rutGon();
        }

        public void rutGon() {
            long ucln = gcd(tu, mau);
            tu = tu / ucln;
            mau = mau / ucln;
        }

        public PhanSo add(PhanSo o) {
            long mauRes = lcm(o.mau, mau);
            long tuRes = tu * (mauRes / mau) + o.tu * (mauRes / o.mau);
            return new PhanSo(tuRes, mauRes);
        }

        public PhanSo mul(PhanSo o) {
            return new PhanSo(tu * o.tu, mau * o.mau);
        }

        @Override
        public String toString() {
            if (tu < 0 && mau < 0) {
                return Math.abs(tu) + "/" + Math.abs(mau);
            } else if (tu < 0 || mau < 0) {
                return "-" + Math.abs(tu) + "/" + Math.abs(mau);
            } else {
                return tu + "/" + mau;
            }
        }
    }

    private static long gcd(long a, long b) {
        if (b != 0) a = gcd(b, a % b);
        return a;
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
