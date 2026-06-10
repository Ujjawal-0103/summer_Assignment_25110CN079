//Write a program to Print reverse pyramid.

import java.util.*;
public class Q38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number of rows to be printed.
        System.out.print("Enter number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("REVERSE PYRAMID:");

        //Loop to control number of rows.
        for(int i = 0; i < num; i++){

            //Loop to print spaces.
            for(int space = 0; space < i; space++){
                System.out.print(" ");
            }
            
            //Loop to print asterisks.
            for(int j = num; j > i; j--){
                System.out.print("*" + " ");
            }

        System.out.println();
        }
    }
}

