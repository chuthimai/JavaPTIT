//J01013 TỔNG ƯỚC SỐ - 1
import java.util.*;

public class J01013 {
    static boolean[] sang = new boolean[2000001];
    static int[] arr = new int[2000001];
    static int sum_prime_factorization(int n){
        if (n <= 1) {
            return 0;
        }
        return arr[n] + sum_prime_factorization(n/arr[n]);
    }
    public static void main(String[] args){
        for (int i=2; i<2000001; i++) {
            sang[i] = true;
        }
        for (int i=2; i<2000001; i++) {
            if (sang[i]){
                arr[i] = i;
                for(int j=i*2; j<2000001; j=j+i) {
                    sang[j] = false;
                    arr[j] = i;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        long sum = 0;
        for(int i=0; i<times; i++){
            int n = scanner.nextInt();
            sum += (long) sum_prime_factorization(n);
//            System.out.println(sum_prime_factorization(n));
        }
        System.out.println(sum);
    }
}
