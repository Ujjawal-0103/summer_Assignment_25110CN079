//Write a program to Find column-wise sum.

import java.util.Scanner;
public class Q80{
    public static void columnWiseSum(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0; i < column; i++){
            int sum = 0;
            for(int j = 0; j < row; j++){
                sum += matrix[j][i];            //update the sum value.
            }

            System.out.println("Sum of column " + (i+1) + " is: " + sum);      //print column-wise sum.
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

        //Call the function.
        columnWiseSum(matrix);

        sc.close();
    }
}

