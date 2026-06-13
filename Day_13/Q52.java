//Write a program to Count even and odd elements.

import java.util.Scanner;
public class Q52{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter the elements of array:");
        //Loop to input elements in array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0){        //Check if even.
                evenCount++;            //Update even count value.
            }
            else{
                oddCount++;             //Update odd count value.
            }
        }

        System.out.println("Even number of elements is/are: " + evenCount);
        System.out.println("Odd number of elements is/are: " + oddCount);
    }
}

