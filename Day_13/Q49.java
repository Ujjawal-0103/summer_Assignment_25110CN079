//Write a program to Input and display array.

import java.util.Scanner;
public class Q49{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of array:");
        //Loop to input elements in array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of array:");
        //Loop to display elements of the array.
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

