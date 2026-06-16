//Write a program to Find missing number in array.

import java.util.Scanner;
public class Q61{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int actualSum = 0;

        System.out.println("Enter the elements of the array from 1 onwards:");
        //Input the elements of the array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            actualSum += arr[i];            //update the value of actual sum.
        }

        int expectedSum = (size+1)*(1 + size+1)/2;          //calculate the actual sum of all the elements including missing element.

        System.out.println("Missing element is: " + (expectedSum - actualSum));
    }
}

