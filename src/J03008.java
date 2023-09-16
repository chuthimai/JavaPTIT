//J03008 SỐ ĐẸP 3

import java.util.Scanner;

public class J03008 {
    static boolean isPerfectNumber (String num){
        boolean isTrue = true;
        num = num.replaceAll("^0*","");
        StringBuilder valNum = new StringBuilder(num);
        if (!num.equals(new String(valNum.reverse()))){
            isTrue = false;
        }
        for (int i=0; i<valNum.length(); i++){
            int digit = valNum.charAt(i) - '0';
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7){
                isTrue = false;
            }
        }
        return isTrue;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String num = scanner.next();
            if (isPerfectNumber(num)) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
