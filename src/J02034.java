//J02034 BỔ SUNG DÃY SỐ

import java.util.Scanner;

public class J02034 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[105];
        arr[0] = 0;
        for (int i=1; i<=n; i++) arr[i] = scanner.nextInt();
        boolean isExcellent = true;
        for (int i=0; i<=n-1; i++){
            int k = arr[i]+1;
            while (k < arr[i+1]){
                System.out.println(k);
                k++;
                isExcellent = false;
            }
        }
        if (isExcellent) System.out.println("Excellent!");
    }
}
