//J02106 MA TRẬN NHỊ PHÂN

import java.util.Scanner;

public class J02106 {
    public static class Matrix {
        private int row, column;
        private int[][] matrix;
        public Matrix(int row, int column){
            this.row = row;
            this.column = column;
            matrix = new int[row+1][column+1];
        }
        public void inputVal(int[][] matrix){
            this.matrix = matrix.clone();
        }
        public int getRow() {
            return row;
        }
        public int getColumn() {
            return column;
        }
        public int countRow1(){
            int count = 0;
            for (int i=0; i<row; i++){
                int count1 = 0;
                for (int j=0; j<column; j++) {
                    if (matrix[i][j]==1) count1++;
                    if (count1 > 1) break;
                }
                if (count1 > 1) count++;
            }
            return count;
        }
        public void printMatrix(){
            for (int i=0; i<row; i++){
                for (int j=0; j<column; j++) System.out.print(matrix[i][j]+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt(), column = 3;
        Matrix matrix = new Matrix(row, column);
        int[][] m = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++) m[i][j] = scanner.nextInt();
        }
        matrix.inputVal(m);
        System.out.println(matrix.countRow1());
    }
}
