//J03013 HIỆU SỐ NGUYÊN LỚN - 1

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            BigInteger num1 = scanner.nextBigInteger();
            BigInteger num2 = scanner.nextBigInteger();
            if (num1.compareTo(num2) < 0){
                BigInteger mid = num1;
                num1 = num2;
                num2 = mid;
            }
            BigInteger res = num1.subtract(num2);
            if (num1.toString().length() > res.toString().length()) System.out.print(0);
            System.out.println(res);
        }
    }
}
