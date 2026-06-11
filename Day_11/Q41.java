//Write a program to Write function to find sum of two numbers.

import java.util.Scanner;
public class Q41{
    public static int sum(int num1, int num2){
        //return the sum of two numbers.
        return num1 + num2;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //input 1st number.
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        //Input 2nd number.
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        //Calling the function and printing the output.
        System.out.println("Sum: " + sum(num1, num2));
    }
}