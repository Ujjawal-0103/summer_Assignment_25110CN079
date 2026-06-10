//Write a program to Print hollow square pattern.

import java.util.*;
public class Q36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number of rows to be printed.
        System.out.print("Enter the number of rows to be printed: ");
        int num = sc.nextInt();

        System.out.println("HOLLOW SQUARE PATTERN:");
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i == 0 || i == num-1 || j == 0 || j == num-1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
        System.out.println();
        }
    }
}

