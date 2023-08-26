//J01017 SỐ LIỀN KỀ
import java.util.Scanner;

public class J01017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String num = scanner.next();
            boolean is_true = true;
            for (int j=1; j<num.length(); j++){
                if (Math.abs(num.charAt(j)-num.charAt(j-1)) != 1){
                    is_true = false;
                    break;
                }
            }
            if (is_true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
