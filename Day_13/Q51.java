//Write a program to Find largest and smallest element.

import java.util.Scanner;
public class Q51{
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

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < size; i++){
            if(max < arr[i]){           //Updating maximum element value.
                max = arr[i];
            }

            if(min > arr[i]){           //Updating minimum element value.
                min = arr[i];
            }
        }

        System.out.println("Largest element is: " + max);
        System.out.println("smallest element is: " + min);
    }
}

