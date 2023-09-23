//J02014 ĐIỂM CÂN BẰNG

import java.util.Scanner;

public class J02014 {
    static Scanner scanner = new Scanner(System.in);
    public static void oneTime(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        sum[0] = arr[0];
        for (int i=1; i<n; i++) sum[i] = sum[i-1] + arr[i];
        int pos = -1;
        for (int i=1; i<n-1; i++){
            if (sum[i] - arr[i] == sum[n-1] - sum[i]){
                pos = i+1;
                break;
            }
        }
        System.out.println(pos);
    }
    public static void main(String[] args){
        int times = scanner.nextInt();
        for (int i=0; i<times; i++) oneTime();
    }
}
