//J03015 HIỆU SỐ NGUYÊN LỚN - 2

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();
        BigInteger res = num1.subtract(num2);
        System.out.println(res);
    }
}
