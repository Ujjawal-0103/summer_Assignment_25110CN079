//Write a program to Write function for Armstrong.

import java.util.Scanner;
public class Q46{
    public static void isArmstrong(int num){
        if(num < 0){
            System.out.println("Please enter a valid non-negative number.");
            return;
        }

        int digit = 0;
        int temp = num;

        //Calculate digits.
        while(temp > 0){
            digit++;
            temp /= 10;
        }

        temp = num;

        int rem = 0;
        while(temp > 0){
            rem = rem + (int)Math.pow((temp%10),digit);
            temp /= 10;
        }

        //Check for armstrong number.
        if(num == rem){
            System.out.println("Yes! " + num + " is an Armstrong Number.");
        }
        else{
            System.out.println("No! " + num + " is not an Armstrong Number.");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //Call function.
        isArmstrong(num);
    }
}

