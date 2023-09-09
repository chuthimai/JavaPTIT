//J02101 IN MA TRẬN

import java.util.Scanner;

public class J02101 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();

        for (int i=0; i<times; i++){
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            for (int k=0; k<n; k++){
                for (int j=0; j<n; j++) arr[k][j] = scanner.nextInt();
            }

            int colControl, rowIndex = 0, colIndex;
            while (rowIndex < n){
                if (rowIndex % 2 == 0){
                    colControl = 1;
                    colIndex = 0;
                }else {
                    colControl = -1;
                    colIndex = n-1;
                }
                while (colIndex < n && colIndex >= 0){
                    System.out.print(arr[rowIndex][colIndex]+" ");
                    colIndex += colControl;
                }
                rowIndex++;
            }
            System.out.println();
        }
    }
}
