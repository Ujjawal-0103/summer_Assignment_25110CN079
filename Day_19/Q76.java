//Write a program to Find diagonal sum.

import java.util.Scanner;
public class Q76{
    public static int diagonalSum(int[][] matrix){
        int row = matrix.length;
        int sum = 0;

        for(int i = 0; i < row; i++){
            sum += matrix[i][i];        //update the value of sum.
        }

        return sum;
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

        if(row != column){
            System.out.print("Rows and columns must be equal for calculating trace.");
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

        //Call the function.
        System.out.print("Diagonal sum is: " + diagonalSum(matrix));

        sc.close();
    }
}

