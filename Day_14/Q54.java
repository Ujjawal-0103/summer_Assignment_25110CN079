//Write a program to Frequency of an element.

import java.util.Scanner;
public class Q54{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //input size of the array.
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        
        //input element of the array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element whose frequency to be found: ");
        int target = sc.nextInt();

        int count = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] == target){           //check if the element matches.
                count++;                    //update the count value.
            }
        }

        System.out.print("Frequency of " + target + " is: " + count);
    }
}

