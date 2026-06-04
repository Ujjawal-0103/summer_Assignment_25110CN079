//Write a program to Find largest prime factor.

import java.util.*;
public class Q20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take number as input.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int lpf = -1;       //lpf --> largest prime factor.

        for(int i = 2; i <= num; i++){
            //check for factor of num.
            if(num % i == 0){
            //Let the factor be prime.
            boolean isPrime = true;

            //check if the factor is prime.
            for(int j = 2; j*j <= i; j++){
                //If composite.
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            //If it is a prime factor.
            if(isPrime){
                //Update the value of largest prime factor.
                lpf = i;
            }
            }
        }

        //Check for largest prime factor.
        if(lpf != -1){
            System.out.println("Largest prime factor is: " + lpf);
        }
        else{
            System.out.println("No largest prime number.");
        }
    }
}

