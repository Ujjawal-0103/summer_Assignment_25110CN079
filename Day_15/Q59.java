//Write a program to Rotate array right.

import java.util.Scanner;
public class Q59{
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

        int last = arr[size-1];             //store the last element.
        for(int i = size-1; i > 0; i--){
            arr[i] = arr[i-1];          //shift all elements to the right.
        }

        arr[0] = last;            //place the last element at the first position.

        System.out.println("Rotated array:");
        for(int i= 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

