//J03021 ĐIỆN THOẠI CỤC GẠCH

import java.util.Scanner;

public class J03021 {
    static boolean isReverse(String str){
        int len = str.length();
        for (int i=0; i<len/2+1; i++){
            if (str.charAt(i) != str.charAt(len-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] key = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String s = scanner.next();
            String num = "";
            for (int j=0; j<s.length(); j++){
                if (s.charAt(j) >= 97) num += Integer.toString(key[(int) s.charAt(j) - 97]);
                else if (s.charAt(j) >= 65) num += Integer.toString(key[(int) s.charAt(j) - 65]);
            }
            if (isReverse(num)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
