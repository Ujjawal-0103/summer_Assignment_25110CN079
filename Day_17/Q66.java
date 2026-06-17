//Write a program to Union of arrays.

import java.util.LinkedHashSet;
import java.util.Scanner;
public class Q66{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the 1st array: ");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the 2nd array: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the 2nd array: ");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> union = new LinkedHashSet<>();

        for(int num : arr1){
            union.add(num);
        }

        for(int num : arr2){
            union.add(num);
        }

        System.out.println("Union of Arrays");
        for(int num : union){
            System.out.print(num + " ");
        }

        sc.close();
    }
}

