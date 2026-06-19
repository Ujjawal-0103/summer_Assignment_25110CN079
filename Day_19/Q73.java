//Write a program to Add matrices.

import java.util.Scanner;
public class Q73{
    public static void addMatrices(int[][] matrix_1, int[][] matrix_2){
        int row = matrix_1.length;
        int column = matrix_1[0].length;

        System.out.println("Addition of the matrices:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                //Add the elements of both the matrices and print them.
                System.out.print(matrix_1[i][j] + matrix_2[i][j] + " ");
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
            System.out.print("Rows and columns must be positive.");
            sc.close();
            return;
        }

        int[][] matrix_1 = new int[row][column];
        int[][] matrix_2 = new int[row][column];

        System.out.println("Enter the elements of the matrix 1:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the matrix 2:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix_2[i][j] = sc.nextInt();
            }
        }

        //Call the function.
        addMatrices(matrix_1, matrix_2);

        sc.close();
    }
}

