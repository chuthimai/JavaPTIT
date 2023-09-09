//J02010 SẮP XẾP ĐỔI CHỖ TRỰC TIẾP

import java.util.Arrays;
import java.util.Scanner;

public class J02010 {
    static void printArr(int[] arr, int n){
        for (int i=0; i<n; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    static boolean compareArr(int[] arr1, int[] arr2, int n){
        boolean isTrue = true;
        for (int i=0; i<n; i++){
            if (arr1[i] != arr2[i]){
                isTrue = false;
                break;
            }
        }
        return isTrue;
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
            int[] oldArr = arr.clone();

            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[i]){
                    int mid = arr[i];
                    arr[i] = arr[j];
                    arr[j] = mid;
                }
            }

            if (compareArr(oldArr, arr, n)) continue;
            System.out.print("Buoc "+step+": ");
            printArr(arr, n);
            step++;
            if (isSort(arr, n)) break;
        }
    }
}
