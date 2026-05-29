//Write a program to Count digits in a number. 

import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int temp = num;
        int digit = 0;
        while(temp > 0){
            digit++;
            temp /= 10;
        }

        System.out.print("Number of digits in " + num + " is: " + digit);
    }
}

