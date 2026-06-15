//Write a program to Reverse array.

import java.util.Scanner;
public class Q57{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //Input elements of the array.
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = size -1;

        while(start < end){
            //swap the elements.
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");     //print elements of the reversed array.
        }
    }
}

