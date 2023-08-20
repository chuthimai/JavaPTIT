//J01009 TỔNG GIAI THỪA
import java.util.Scanner;

public class J01009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        long factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
            sum = sum + factorial;
        }
        System.out.println(sum);
    }
}
