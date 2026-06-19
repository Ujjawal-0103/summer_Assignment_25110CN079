//Write a program to Transpose matrix.

import java.util.Scanner;
public class Q75{
    public static int[][] transposeMatrix(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        //Print the matrix.
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns of matrix: ");
        int column = sc.nextInt();

        if(row <= 0 || column <= 0){
            System.out.println("Rows and columns must be positive.");
            sc.close();
            return;
        }

        int[][] matrix = new int[row][column];

        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of Matrix:");
        //Call the function.
        int[][] transpose = transposeMatrix(matrix);
        printMatrix(transpose);

        sc.close();
    }
}

