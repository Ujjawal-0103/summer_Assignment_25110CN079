//Write a program to Check whether a number is palindrome.

import java.util.*;
public class Q8{
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

        if(num == rev){
            System.out.print("Yes! the number is a Palindrome.");
        }
        else{
            System.out.print("NO! the number is NOT a Palindrome.");
        }
    }
}

