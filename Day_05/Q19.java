//Write a program to Print factors of a number.

import java.util.*;
public class Q19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Take numbere as input.
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are:");
        //Calculate factors of the number.
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}

