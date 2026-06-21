//Write a program to Reverse a string.

import java.util.Scanner;
public class Q82{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");

        StringBuilder str = new StringBuilder(sc.nextLine());
        
        int length = str.length();
        for(int i = 0; i < length/2; i++){
            char ch = str.charAt(i);
            str.setCharAt(i, str.charAt(length-1 -i));
            str.setCharAt(length-1 - i, ch);
        }

        System.out.println("Reversed String:");
        System.out.print(str);

        sc.close();
    }
}

