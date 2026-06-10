//Write a program to Print character pyramid.

import java.util.*;
public class Q40{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number of rows to be printed.
        System.out.print("Enter number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("CHARACTER PYRAMID:");

        //Loop to control number of rows.
        for(int i = 0; i < num; i++){

            //Loop to print spaces.
            for(int space = num-1; space > i; space--){
                System.out.print(" ");
            }

            char ch = 'A';
            //Loop to print ascending characters.
            for(int j = 1; j <= i+1; j++){
                System.out.print(ch++);
            }

            //loop to print desccending characters.
            for(int k = i; k > 0; k--){
                System.out.print((char)(ch-2));
                ch--;
            }

            System.out.println();
        }
    }
}

