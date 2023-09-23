//J02022 SỐ XA CÁCH

import java.util.Scanner;

public class J02022 {
    static int n;
    static int[] res, mark;
    static Scanner scanner = new Scanner(System.in);
    public static void print(int[] res){
        for (int i=1; i<res.length; i++) System.out.print(res[i]);
        System.out.println();
    }
    public static void deQuy(int i){
        for (int j=1; j<=n; j++){
            if (mark[j] == 0){
                mark[j] = 1;
                res[i] = j;
                if (Math.abs(res[i] - res[i-1]) != 1){
                    if (i==n) print(res);
                    else deQuy(i+1);
                }
                mark[j] = 0;
            }
        }
    }
    public static void oneTime(){
        n = scanner.nextInt();
        res = new int[n+1];
        res[0] = 11;
        mark = new int[n+1];
        deQuy(1);
    }
    public static void main(String[] args){
        int times = scanner.nextInt();
        for (int i=0; i<times; i++) oneTime();
    }
}
