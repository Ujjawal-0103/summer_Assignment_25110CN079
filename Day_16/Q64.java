//Write a program to Remove duplicates from array.

import java.util.HashSet;
import java.util.Scanner;
public class Q64{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input the size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //Input the elements of the array.
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //Create a HashSet.
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Array after removing duplicates:");
        for(int num : arr){
            if(set.add(num)){
                System.out.print(num + " ");
            }
        }
    }
}

