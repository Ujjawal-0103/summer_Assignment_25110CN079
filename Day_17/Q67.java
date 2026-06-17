//Write a program to Intersection of arrays.

import java.util.LinkedHashSet;
import java.util.Scanner;
public class Q67{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of the 1st array:");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the 2nd array: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of the 2nd array:");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        for(int num : arr1){
            set1.add(num);
        }

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        for(int num : arr2){
            set2.add(num);
        }

        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        for(int num : set1){
            if(set2.contains(num)){
                intersection.add(num);
            }
        }

        if(intersection.isEmpty()){
            System.out.print("No intersection found.");
        }
        else{
            System.out.println("Intersection of Arrays:");
            for(int num : intersection){
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}

