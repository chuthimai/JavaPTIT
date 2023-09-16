//J03007 SỐ ĐẸP 2

import java.util.Scanner;

public class J03007 {
    static boolean isPerfectNumber (String num){
        boolean isTrue = true;
        num = num.replaceAll("^0*","");
        StringBuilder valNum = new StringBuilder(num);
        if (valNum.charAt(0) != '8' || valNum.charAt(valNum.length()-1) != '8'){
            isTrue = false;
        }
        if (!valNum.equals(valNum.reverse())){
            isTrue = false;
        }
        int sum = 0;
        for (int i=0; i<valNum.length(); i++){
            sum += (int) valNum.charAt(i) - (int) '0';
        }
//        System.out.println(sum);
        if (sum % 10 != 0) isTrue = false;
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
