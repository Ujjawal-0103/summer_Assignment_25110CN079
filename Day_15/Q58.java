//Write a program to Rotate array left.

import java.util.Scanner;
public class Q58{
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

        int first = arr[0];             //store the first element.
        for(int i = 0; i < size-1; i++){
            arr[i] = arr[i+1];          //shift all elements to the left.
        }

        arr[size-1] = first;            //place the first element at the last position.

        System.out.println("Rotated array:");
        for(int i= 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

