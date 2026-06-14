//Write a program to Linear search.

import java.util.Scanner;
public class Q53{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //Input elements of array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();
        boolean found = false;
        int idx = -1;

        for(int i = 0; i < size; i++){
            if(arr[i] == target){
                idx = i;
                found = true;
                break;
            }
        }

        if(found){
            System.out.print("Element found at index: " + idx);
        }
        else{
            System.out.print("Element not found.");
        }
    }
}

