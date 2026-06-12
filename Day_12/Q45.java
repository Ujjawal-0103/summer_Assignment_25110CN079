//Write a program to Write function for palindrome.

import java.util.Scanner;
public class Q45{
    public static boolean isPalindrome(int num){
        int temp = num, rem = 0;
        while(temp > 0){
            rem = rem * 10 + temp%10;
            temp /= 10;
        }

        if(num == rem){
            return true;
        }
        else{
            return false;
        }
    }

    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is a Palindrome.");
        }
        else{
            System.out.println(num + " is not a Palindrome.");
        }
    }
}