//Write a program to Check Armstrong number.

import java.util.*;
public class Q15{
    public static void isArmstrong(int num){
        int digit = 0;
        int temp = num;

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

        if(num == rem){
            System.out.println("Yes! " + num + " is an Armstrong Number.");
        }
        else{
            System.out.println("No! " + num + " is not an Armstrong Number.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        isArmstrong(num);
    }
}

