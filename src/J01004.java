//J01004 SỐ NGUYÊN TỐ
import java.util.Scanner;
import java.lang.Math;

public class J01004 {
    static boolean check_prime(int n){
        for(int i=2; i<=Math.sqrt(n)+1; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=0; i<times; i++){
            int n = scanner.nextInt();
            if(check_prime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
