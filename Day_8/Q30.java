//Write a program to Print number triangle.

import java.util.*;
public class Q30{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number of rows to be printed.
        System.out.print("Enter the number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("NUMBER TRIANGLE:");
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

