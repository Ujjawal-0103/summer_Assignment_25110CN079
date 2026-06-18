//Write a program to Sort array in descending order.

import java.util.Scanner;
public class Q72{
    public static void divide(int[] arr, int start, int end){
        if(start >= end){         //Base Case: If single element or invalid.
            return;
        }
    
        int mid = start + (end - start)/2;
    
        // Divide left half.
        divide(arr, start, mid);

        // Divide right half.
        divide(arr, mid + 1, end);
    
        //Once broken down to base cases, start merging.
        conquer(arr, start, mid, end);
    }

    public static void conquer(int[] arr, int start, int mid, int end){
        int[] merged = new int[end - start + 1];
    
        int idx1 = start;             //Pointer for left half.
        int idx2 = mid + 1;          //Pointer for right half.
        int x = 0;                  //Pointer for merged array.
    
        //Compare and merge
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] >= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
    
        //Copy remaining elements from left half.
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
    
        //Copy remaining elements from right half.
        while(idx2 <= end){
            merged[x++] = arr[idx2++];
        }
    
        //Copy merged array back to original array.
        for(int i = 0, j = start; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        //check if size valid or not.
        if(size <= 0){
            System.out.print("Enter valid size.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i =  0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //Call the divide function.
        divide(arr, 0, size-1);

        System.out.println("Sorted Array in descending order:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

