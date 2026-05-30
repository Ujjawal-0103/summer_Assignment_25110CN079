//Write a program to Find product of digits. 

import java.util.*;
public class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int temp = num;
        int product = 1;
        while(temp > 0){
            int digit = temp % 10;
            product = product * digit;
            temp /= 10;
        }

        System.out.print("product of digits of " + num + " is: " + product);
    }
}

