//Write a program to Second largest element.

import java.util.Scanner;
public class Q55{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean found = false;

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < size; i++){
            int num = sc.nextInt();

            if(num > largest){
                secondLargest = largest;
                largest = num;

                if(secondLargest != Integer.MIN_VALUE){
                    found = true;
                }
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
                found = true;
            }
        }

        if(found){
            System.out.println("Second largest element: " + secondLargest);
        }
        else{
            System.out.println("No second largest element found.");
        }
    }
}

