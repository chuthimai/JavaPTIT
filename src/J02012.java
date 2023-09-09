//J02012 SẮP XẾP CHÈN

import java.util.ArrayList;
import java.util.Scanner;

public class J02012 {
    static void printArr(ArrayList<Integer> arr){
        for (Integer num: arr) System.out.print(num+" ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[101];
        ArrayList<Integer> arrSort = new ArrayList<Integer>();
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        int step = 1;
        arrSort.add(arr[0]);
        System.out.print("Buoc 0: ");
        printArr(arrSort);
        for (int i=1; i<n; i++){
            for (int j=0; j<arrSort.size(); j++){
                if (arr[i] < arrSort.get(j)){
                    arrSort.add(j, arr[i]);
                    break;
                }
                if (arr[i] > arrSort.get(i-1)) {
                    arrSort.add(arr[i]);
                    break;
                }
            }
            System.out.print("Buoc "+step+": ");
            printArr(arrSort);
            step++;
        }
    }
}
