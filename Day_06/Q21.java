//Write a program to Convert decimal to binary.

import java.util.*;
public class Q21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take number as input.
        System.out.print("Enter any decimal number: ");
        int num  = sc.nextInt();

        int binary = 0;
        int place = 1;
        int temp = num;
        while(temp > 0){
            int rem = temp%2;
            binary += rem*place;

            place *= 10;
            temp /= 2;
        }

        System.out.println("Binary of " + num + " is: " + binary);
    }
}

