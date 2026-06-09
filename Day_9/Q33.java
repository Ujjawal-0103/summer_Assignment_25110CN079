//Write a program to Print reverse star pattern.

import java.util.*;
public class Q33{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number of rows to be printed.
        System.out.print("Enter the number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("REVERSE STAR PATTERN:");
        for(int i = 0; i < num; i++){
            for(int j = num; j > i; j--){
                System.out.print("*" + " ");
            }
        System.out.println();
        }
    }
}

