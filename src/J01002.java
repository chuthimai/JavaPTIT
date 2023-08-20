//J01002 TÍNH TỔNG N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN
import java.util.Scanner;

public class J01002 {
    static long calculateSum(long n) {
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            long n = scanner.nextInt();
            long sum = calculateSum(n);
            System.out.println(sum);
        }
    }
}
