//Write a program to Reverse a number.

import java.util.*;
public class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        System.out.print("Reverse of " + num + " is: " + rev);
    }
}

