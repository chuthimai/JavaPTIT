//J01018 SỐ KHÔNG LIỀN KỀ

import java.util.Scanner;

public class J01018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String num = scanner.next();
            boolean is_true = true;
            int sum_digit = num.charAt(0) - '0';
            for (int j=1; j<num.length(); j++){
                if (Math.abs(num.charAt(j)-num.charAt(j-1)) != 2){
                    is_true = false;
                    break;
                }
                sum_digit += num.charAt(j) - '0';
            }
            if (is_true && sum_digit%10 != 0) is_true = false;
            if (is_true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
