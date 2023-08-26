//J01022 XÂU NHỊ PHÂN

import java.util.Scanner;

public class J01022 {
    static long[] Fib = new long[93];
    static char find(int n, long pos){
        if (n==1) return '0';
        if (n==2) return '1';
        if (pos > Fib[n-2]) return find(n-1, pos-Fib[n-2]);
        else return find(n-2, pos);
    }
    public static void main(String[] args){
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i=2; i<93; i++){
            Fib[i] = Fib[i-2] + Fib[i-1];
        }
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(find(n, k));
        }
    }
}
