//J02013 SẮP XẾP NỔI BỌT

import java.util.Scanner;

public class J02013 {
    static void printArr(int[] arr, int n){
        for (int i=0; i<n; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    static boolean isSort(int[] arr, int n){
        boolean isTrue = true;
        for (int i=0; i<n-1; i++){
            if (arr[i] > arr[i+1]){
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[101];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        int step = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                if (arr[j] > arr[j+1]){
                    int mid = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = mid;
                }
            }

            System.out.print("Buoc "+step+": ");
            printArr(arr, n);
            step++;
            if (isSort(arr, n)) break;
        }
    }
}
