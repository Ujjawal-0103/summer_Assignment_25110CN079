//Write a program to Print reverse number triangle.

import java.util.*;
public class Q34{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number of rows to be printed.
        System.out.print("Enter the number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("REVERSE NUMBER TRIANGLE:");
        for(int i = num; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}   

