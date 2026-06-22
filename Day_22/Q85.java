//Write a program to Check palindrome string.

import java.util.Scanner;
public class Q85{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1 -i)){
                System.out.print("String is not a palindrome.");
                sc.close();
                return;
            }
        }

        System.out.print("String is a Palindrome.");
        sc.close();
    }
}

