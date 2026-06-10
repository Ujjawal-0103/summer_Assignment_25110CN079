//Write a program to Print star pyramid.

import java.util.*;
public class Q37{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number of rows to be printed.
        System.out.print("Enter number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("STAR PYRAMID:");

        //Loop to control number of rows.
        for(int i = 0; i < num; i++){
            //Loop for spaces.
            for(int space = num-1; space > i; space--){
                System.out.print(" ");
            }

            //Loop for asterisks.
            for(int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

