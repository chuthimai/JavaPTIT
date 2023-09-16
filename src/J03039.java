//J03039 CHIA HẾT

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
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
            if (num1.mod(num2).compareTo(new BigInteger("0")) == 0){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
