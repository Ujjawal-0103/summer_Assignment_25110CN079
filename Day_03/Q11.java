//Write a program to Find GCD of two numbers.

import java.util.*;
public class Q11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + a);
        
    }
}

