//Write a program to Find pair with given sum.

import java.util.HashSet;
import java.util.Scanner;
public class Q63{
    public static void main(String args[]){
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

        //Input the sum to be found.
        System.out.print("Enter the sum: ");
        int target = sc.nextInt();

        //Create hashset for all the pairs.
        HashSet<Integer> set = new HashSet<>();
        //Create hashset for all the unique pairs.
        HashSet<String> unique = new HashSet<>();
        boolean found = false;

        for(int num1 : arr){
            int num2 = target - num1;

            if(set.contains(num2)){         //check if it is in the array or not.
                int a = Math.min(num1, num2);           
                int b = Math.max(num1, num2);

                String pair = a + "," + b;
                if(!unique.contains(pair)){             //if the pair is not added in the hashSet yet.
                    System.out.println("Pair found: " + a + "," + b);       //print the pair.
                    unique.add(pair);                                       //add pair to the hashSet.
                    found = true;
                }
            }

            set.add(num1);
        }

        if(!found) {                    //if no pair found.
            System.out.println("No pair found");
        }
    }
}

