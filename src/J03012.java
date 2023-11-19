//J03012 TỔNG SỐ NGUYÊN LỚN - 1

import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));
        }
    }
}
