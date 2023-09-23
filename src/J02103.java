//J02103 TÍCH MA TRẬN VỚI CHUYỂN VỊ CỦA NÓ

import java.util.Scanner;

public class J02103 {
    public static class Matrix {
        private int row, column;
        private int[][] matrix;
        public Matrix(int row, int column){
            this.row = row;
            this.column = column;
            matrix = new int[row][column];
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
        public Matrix transpose(){
            Matrix matrix1 = new Matrix(column, row);
            for (int i=0; i<column; i++){
                for (int j=0; j<row; j++) matrix1.matrix[i][j] = matrix[j][i];
            }
            return matrix1;
        }
        public static Matrix mul(Matrix m1, Matrix m2){
            Matrix res = new Matrix(m1.getRow(), m2.getColumn());
            for (int i=0; i<m1.getRow(); i++){
                for (int j=0; j<m2.getColumn(); j++){
                    for (int k=0; k<m1.getColumn(); k++)
                        res.matrix[i][j] += m1.matrix[i][k]*m2.matrix[k][j];
                }
            }
            return res;
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
        int times = scanner.nextInt(), k=1;
        while (times > 0){
            int row = scanner.nextInt(), column = scanner.nextInt();
            Matrix matrix = new Matrix(row, column);
            int[][] m = new int[row][column];
            for (int i=0; i<row; i++){
                for (int j=0; j<column; j++) m[i][j] = scanner.nextInt();
            }
            matrix.inputVal(m);
            Matrix matrix1 = Matrix.mul(matrix, matrix.transpose());
            System.out.println("Test "+k+":");
            matrix1.printMatrix();
            k++;
            times --;
        }
    }
}
