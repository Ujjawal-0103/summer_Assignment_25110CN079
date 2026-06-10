//Write a program to Print number pyramid.

import java.util.*;
public class Q39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number of rows to be printed.
        System.out.print("Enter number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("NUMBER PYRAMID:");

        //Loop to control number of rows.
        for(int i = 0; i < num; i++){

            //Loop to print spaces.
            for(int space = num-1; space > i; space--){
                System.out.print(" ");
            }

            //Loop to print ascending numbers.
            for(int j = 1; j <= i+1; j++){
                System.out.print(j);
            }

            //Loop to print descending numbers.
            for(int k = i; k > 0; k--){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

