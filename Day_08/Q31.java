//Write a program to Print character triangle.

import java.util.*;
public class Q31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number of rows to be printed.
        System.out.print("Enter the number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("CHARACTER TRIANGLE:");
        for(int i = 1; i <= num; i++){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

