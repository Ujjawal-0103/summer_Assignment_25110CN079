//Write a program to Check whether a number is prime. 

import java.util.*;
public class Q9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int isPrime = 1;

        if(num > 1){
            for(int i = 2; i*i <= num; i++){
                if(num % i == 0){
                    isPrime = 0; 
                    break;
                }
            }
        }
        else if(num == 0 || num == 1){
            System.out.println("Neither Prime nor Composite!!");
            return;
        }
        else{
            System.out.println("Please Enter a valid positive number.");
            return;
        }

        if(isPrime == 1){
            System.out.println(num + " is prime!!");
        }
        else{
            System.out.println(num + " is not a prime!");
        }
    }
}

