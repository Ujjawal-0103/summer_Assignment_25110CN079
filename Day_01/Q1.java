//Write a program to Calculate sum of first N natural numbers. 

import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.print("The sum upto " + n + "th " + "natural number is: ");
        System.out.print(sum);
    }
}

