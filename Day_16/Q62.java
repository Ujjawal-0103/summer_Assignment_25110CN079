//Write a program to Find maximum frequency element.

import java.util.Scanner;
import java.util.HashMap;
public class Q62{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:");
        //Input the elements of the array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //create a hashmap.
        HashMap<Integer, Integer> map = new HashMap<>();

        //Count frequencies
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxFreq = 0;

        // Find maximum frequency
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        //print all the element with the maximum frequency.
        System.out.println("Maximum frequency element(s) is/are:");
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxFreq){
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.print("with frequency: " + maxFreq);
    }
}

