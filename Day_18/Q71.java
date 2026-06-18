//Write a program to Binary search.

import java.util.Scanner;
public class Q71{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        //check if size valid or not.
        if(size <= 0){
            System.out.print("Enter valid size.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter elements of the array in sorted order: ");
        for(int i =  0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = size - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(target == arr[mid]){
                System.out.print(target + " found at index: " + mid);
                sc.close();
                return;
            }
            else if(target < arr[mid]){
                high = mid - 1;         //update the value of high.
            }
            else{
                low = mid + 1;          //update the value of low.
            }
        }

        //If element is not present in the array.
        System.out.print("Element not found.");
        sc.close();
    }
}

