//Write a program to Recursive factorial.

import java.util.*;
public class Q25{
    public static int factorial(int num){
        //Base condition.
        if(num == 1){
           return 1;
        }

        //return to call recursive function.
        return num * factorial(num-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take number as input.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //Call the function.
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

