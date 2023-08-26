//J01021 TÍNH LŨY THỪA

import java.util.Scanner;

public class J01021 {
    static final long mod = 1000000007;
    static long exp(long a, long b){
        if (b==0) return 1;
        long a_hat_2 = (a * a) % mod;
        if (b%2==0) return exp(a_hat_2, b/2) % mod;
        else return a*exp(a_hat_2, (b-1)/2) % mod;
    }
    public static void main(String[] args){
        long a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        b = scanner.nextLong();
        while (!(a==0 && b==0)){
            System.out.println(exp(a, b));
            a = scanner.nextLong();
            b = scanner.nextLong();
        }
    }
}
