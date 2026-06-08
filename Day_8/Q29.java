//Write a program to Print half pyramid pattern.

import java.util.*;
public class Q29{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Input the number of rows to be printed.
        System.out.print("Enter the number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("HALF PYRAMID PATTERN:");
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
        System.out.println();
        }
    }
}

