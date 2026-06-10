//Write a program to Print prime numbers in a range. 

import java.util.*;
public class Q10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range starting to print prime numbers: ");
        int st = sc.nextInt();
        System.out.print("Enter the range end to print print number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + st + " and " + end + " are:");
        int isPrime = 1;
        if(st == 2){
            System.out.println("2");
        }
        for(int i = st; i <= end; i++){
            if(i<2){
                continue;
            }
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = 0;
                    break;
                }
            }
            if(isPrime == 1){
                System.out.println(i);
            }
            isPrime = 1;
        }
    }
}

