//Write a program to Write function to find factorial.

import java.util.Scanner;
public class Q44{
    public static int factorial(int num){
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //For negative numbers.
        if(num < 0){
            System.out.println("Invalid number!");
            return;
        }

        //Calling the function and printing the output.
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

