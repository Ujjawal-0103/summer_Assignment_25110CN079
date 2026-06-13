//Write a program to Find sum and average of array.

import java.util.Scanner;
public class Q50{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter the elements of array:");
        //Loop to input elements in array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();

            sum += arr[i];          //Calculating sum.
        }

        System.out.println("Sum of the elements of array is: " + sum);
        System.out.println("Average of the elements of array is: " + sum/size);
    }
}

