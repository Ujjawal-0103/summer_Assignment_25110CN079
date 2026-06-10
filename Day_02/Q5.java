//Write a program to Find sum of digits of a number.

import java.util.*;
public class Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        while(temp > 0){
            sum = sum + (temp % 10);
            temp /= 10;
        }

        System.out.print("The sum of digits of " + num + " is: " + sum);
    }
}

