//Write a program to Check symmetric matrix.

import java.util.Scanner;
public class Q78{
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

        if(row != column){
            System.out.print("Matrix must be square.");
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

        for(int i = 0; i < row; i++){
            for(int j = i+1; j < column; j++){
                if(matrix[i][j] != matrix[j][i]){
                    System.out.print("Matrix is not Symmetric.");
                    sc.close();
                    return;
                }
            }
        }

        System.out.print("Matrix is Symmetric.");
        sc.close();
    }
}

