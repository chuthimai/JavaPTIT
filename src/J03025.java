//J03025 XÂU ĐỐI XỨNG

import java.util.Scanner;

public class J03025 {
    static boolean isReverse(String str){
        int count = 0;
        int len = str.length();
        for (int i=0; i<len/2; i++){
            if (str.charAt(i) != str.charAt(len-1-i)) count++;
        }
        if (count == 0 && len%2==1) return true;
        if (count == 1) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String str = scanner.next();
            if (isReverse(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
