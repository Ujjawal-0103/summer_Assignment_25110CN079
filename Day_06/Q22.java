//Write a program to Convert binary to decimal.

import java.util.*;
public class Q22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take binary as input.
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int temp = binary;
        int decimal = 0, power = 0;
        while(temp > 0){
            //update the digit.
            int digit = temp%10;
            
            //calculate decimal.
            decimal += digit * (int)Math.pow(2,power);

            //update the power value.
            power++;

            //update temp value.
            temp /= 10;
        }

        System.out.println("Decimal of " + binary + " is: " + decimal);
    }
}