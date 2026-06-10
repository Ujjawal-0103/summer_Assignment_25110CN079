//Write a program to Recursive sum of digits.

import java.util.*;
public class Q27{
    public static int sumOfDigits(int num, int sum){
        //Base condition.
        if(num == 0){
            return sum;
        }

        //If number is negative.
        if(num < 0){
            num = -1 * num;
        }

        //Update the value of sum.
        sum += num%10;
        //Return to call the recursive function.
        return sumOfDigits(num/10, sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take number as input.
        System.out.print("Enter any number: ");
        int num =  sc.nextInt();

        int sum = 0;

        //Call the function.
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num, sum));
    }
}

