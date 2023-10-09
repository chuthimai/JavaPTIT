package TH1;

import java.util.Scanner;

public class Bai3 {
    static class Matran {
        private int[][] a;
        private int kt;
        public Matran(int n){
            kt = n;
        }
        public Matran(int[][] arr){
            a = arr;
        }

        public void setKT(int kt) {
            this.kt = kt;
        }

        public int getKT() {
            return kt;
        }

        public int[][] getMatran() {
            return a;
        }
        public void input(Scanner sc){
            a = new int[kt][kt];
            for (int i=0; i<kt; i++){
                for (int j=0; j<kt; j++) a[i][j] = sc.nextInt();
            }
        }
        public void out(){
            for (int i=0; i<kt; i++){
                for (int j=0; j<kt; j++) System.out.print(a[i][j]+" ");
                System.out.println();
            }
            System.out.println();
        }
        public Matran hieu(int[][] b){
            int[][] r = new int[kt][kt];
            for (int i=0; i<kt; i++){
                for (int j=0; j<kt; j++) r[i][j] = a[i][j] - b[i][j];
            }
            Matran res = new Matran(r);
            res.setKT(kt);
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran h=m.hieu(b.getMatran());
        //viet ra ma tran hieu
        h.out();
    }
}
