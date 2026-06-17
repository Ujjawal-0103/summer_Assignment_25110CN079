//Write a program to Merge arrays.

import java.util.Scanner;
public class Q65{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of the first array:");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of the second array:");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        int[] outArr = new int[size1 + size2];

        int idx = 0;

        for(int i = 0; i < size1; i++){
            outArr[idx++] = arr1[i];
        }

        for(int i = 0; i < size2; i++){
            outArr[idx++] = arr2[i];
        }

        System.out.println("Merged Array:");
        for(int num : outArr){
            System.out.print(num + " ");
        }
    }
}

