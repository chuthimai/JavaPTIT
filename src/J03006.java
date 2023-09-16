import java.util.Scanner;
import java.util.regex.Pattern;

//J03006 SỐ ĐẸP 1
public class J03006 {
    static boolean isPerfectNumber (String num){
        boolean isTrue = true;
        num = num.replaceAll("^0*","");
        StringBuilder valNum = new StringBuilder(num);
        if (!valNum.equals(valNum.reverse())){
            isTrue = false;
        }
        for (int i=0; i<valNum.length(); i++){
            if ((int) valNum.charAt(i) % 2 == 1) isTrue = false;
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
