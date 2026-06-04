//Write a program to Check perfect number.

import java.util.*;
public class Q17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take input of the number.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int sum = 0;
        //Calculate divisors.
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                //Calculate sum of the divisors.
                sum = sum + i;
            }
        }

        //Check for the perfect number.
        if(sum == num){
            System.out.println("Yes! " + num + " is a perfect number.");
        }
        else{
            System.out.println("No! " + num + " is not a perfect number.");
        }
    }
}

