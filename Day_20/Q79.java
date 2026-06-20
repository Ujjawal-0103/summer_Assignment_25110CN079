//Write a program to Find row-wise sum.

import java.util.Scanner;
public class Q79{
    public static void rowWiseSum(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < column; j++){
                sum += matrix[i][j];            //update the sum value.
            }

            System.out.println("Sum of row " + (i+1) + " is: " + sum);      //print row-wise sum.
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
        rowWiseSum(matrix);

        sc.close();
    }
}

