//J01005 CHIA TAM GIÁC
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class J01005 {
    static void solve(int n, int h){
        Double[] res = new Double[1005];
        for(int i=1; i<n; i++) res[i] = sqrt((double) i/n) * h;
        for(int i=1; i<n; i++) System.out.printf("%.6f ",res[i]);
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=0; i<times; i++){
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            solve(n, h);
        }
    }
}
