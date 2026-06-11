//Write a program to Write function to check prime.

import java.util.Scanner;
public class Q43{
        public static void isPrime(int num){
            //Check for 0 and 1;
            if(num == 0 || num == 1){
                System.out.println("Neither Prime nor Composite.");
            }

            //Check for greater than 1.
            else if(num > 1){
                boolean isPrime = true;

                for(int i = 2; i*i <= num; i++){
                    if(num % i == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    System.out.println("Yes! " + num + " is Prime.");
                }
                else{
                    System.out.println("No! " + num + " is not a Prime.");
                }
            }
            
            //For negative numbers.
            else{
                System.out.println("Please enter a valid positive number.");
            }
        }

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //Call the function.
        isPrime(num);
    }
}