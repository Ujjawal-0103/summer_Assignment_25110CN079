//Write a program to Recursive reverse number.

import java.util.*;
public class Q28{
    public static int reverse(int num, int rem){
        //Base codition.
        if(num <= 0){
            return rem;
        }

        //Return to call the recursive function.
        return reverse(num/10, rem*10 + num%10);
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take number as input.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int rem = 0;

        //Call the function.
        if(num >= 0){       //If number is whole number.
            System.out.println("Reverse of " + num + " is: " + reverse(num, rem));
        }
        else{               //If number if negative.
            System.out.println("Reverse of " + num + " is: " + -reverse(-num, rem));
        }
    }
}

