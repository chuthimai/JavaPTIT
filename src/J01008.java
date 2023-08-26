//J01008 PHÂN TÍCH THỪA SỐ NGUYÊN TỐ
import java.util.*;

public class J01008 {
    static void prime_factorization(int t, int n){
        if (n <= 1) {
            System.out.printf("Test %d: \n", t);
            return;
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int factor = 2, appear = 0;
        while (n != 1){
            if (n % factor == 0){
                n = n / factor;
                appear++;
                map.put(factor, appear);
            }else {
                factor++;
                appear = 0;
            }
        }
        System.out.printf("Test %d: ", t);
        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.printf("%d(%d) ", m.getKey(), m.getValue());
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=0; i<times; i++){
            int n = scanner.nextInt();
            prime_factorization(i+1, n);
        }
    }
}
