//Write a program to Multiply matrices.

import java.util.Scanner;
public class Q77{
    public static int[][] multiplyMatrices(int[][] matrix_1, int[][] matrix_2){
        int row_1 = matrix_1.length;
        int column_1 = matrix_1[0].length;
        int column_2 = matrix_2[0].length;

        int[][] result = new int[row_1][column_2];

        for(int i = 0; i < row_1; i++){
            for(int j = 0; j < column_2; j++){
                for(int k = 0; k < column_1; k++){
                        result[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix 1: ");
        int row_1 = sc.nextInt();

        System.out.print("Enter the number of columns of matrix 1: ");
        int column_1 = sc.nextInt();

        if(row_1 <= 0 || column_1 <= 0){
            System.out.print("Rows and columns must be positive.");
            sc.close();
            return;
        }

        System.out.print("Enter the number of rows of matrix 2: ");
        int row_2 = sc.nextInt();

        System.out.print("Enter the number of columns of matrix 2: ");
        int column_2 = sc.nextInt();

        if(row_2 <= 0 || column_2 <= 0){
            System.out.print("Rows and columns must be positive.");
            sc.close();
            return;
        }

        if(column_1 != row_2){
            System.out.print("Multiplication is not possible.");
            sc.close();
            return;
        }

        int[][] matrix_1 = new int[row_1][column_1];

        System.out.println("Enter the elements of the matrix 1:");
        for(int i = 0; i < row_1; i++){
            for(int j = 0; j < column_1; j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix_2 = new int[row_2][column_2];

        System.out.println("Enter the elements of the matrix 2:");
        for(int i = 0; i < row_2; i++){
            for(int j = 0; j < column_2; j++){
                matrix_2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplication of matrices:");
        //Call the function.
        int[][] result = multiplyMatrices(matrix_1, matrix_2);
        printMatrix(result);

        sc.close();
    }
}

