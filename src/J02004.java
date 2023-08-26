//J02004 MẢNG ĐỐI XỨNG

import java.util.Scanner;

public class J02004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            int n = scanner.nextInt();
            int[] arr = new int[101];
            for (int j=0; j<n; j++) arr[j] = scanner.nextInt();
            int head = 0, tail = n-1;
            boolean is_true = true;
            while (head < tail){
                if (arr[head] != arr[tail]){
                    is_true = false;
                    break;
                }
                head++;
                tail--;
            }
            if (is_true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
