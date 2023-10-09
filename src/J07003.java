//J07003 TÁCH ĐÔI VÀ TÍNH TỔNG

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    private static String sum(String n1, String n2){
        BigInteger num1 = new BigInteger(n1);
        BigInteger num2 = new BigInteger(n2);
        BigInteger sumN = num1.add(num2);
        return sumN.toString(10);
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String num = sc.next();
        while (num.length() > 1) {
            int index = num.length()/2;
            num = sum(num.substring(0, index), num.substring(index));
            System.out.println(num);
        }
    }
}
