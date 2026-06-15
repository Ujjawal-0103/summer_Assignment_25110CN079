//Write a program to Move zeroes to end.

import java.util.Scanner;
public class Q60{
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

        int idx= 0;

        for(int i = 0; i < size; i++){
            if(arr[i] != 0){            //check if it is non-zero.
                //swap to element.
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;                
                idx++;
            }
        }

        System.out.println("Array after moving zeroes to the end:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

