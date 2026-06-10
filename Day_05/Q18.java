//Write a program to Check strong number.

import java.util.*;
public class Q18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take input of the number.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int temp = num, digit, sum = 0;
        while(temp > 0){
            //Calculate factorial
            int fact = 1;
            digit = temp%10;
            for(int i = 1; i <= digit; i++){
                fact = fact * i;
            }

            //sum is calculated of the factorials
            sum = sum + fact;

            temp /= 10;
        }

        //Check for the strong number.
        if(sum == num){
            System.out.println("Yes! " + num + " is a strong number.");
        }
        else{
            System.out.println("No! " + num + " is not a strong number.");
        }
    }
}

