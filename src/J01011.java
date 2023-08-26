//J01011 BỘI SỐ CHUNG - ƯỚC SỐ CHUNG
import java.util.Scanner;

public class J01011 {
    static int gcd(int a, int b){
        while (a*b != 0){
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int gcd = gcd(a, b);
            long lcm = (long)a / (long)gcd * (long)b;
            System.out.printf("%d %d\n", lcm, gcd);
        }
    }
}
