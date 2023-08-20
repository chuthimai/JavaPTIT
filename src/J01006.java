//J01006 TÍNH SỐ FIBONACCI
import java.util.Scanner;

public class J01006 {
    public static void main(String[] args){
        long[] Fib = new long[93];
        Fib[0] = 0;
        Fib[1] = 1;
        for(int i=2; i<93; i++) Fib[i] = Fib[i-1] + Fib[i-2];
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=0; i<times; i++){
            int n = scanner.nextInt();
            System.out.println(Fib[n]);
        }
    }
}
