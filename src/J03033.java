//J03033 BỘI SỐ CHUNG NHỎ NHẤT

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            BigInteger num1 = scanner.nextBigInteger();
            BigInteger num2 = scanner.nextBigInteger();
            System.out.println(num1.multiply(num2).divide(num1.gcd(num2)));
        }
    }
}
