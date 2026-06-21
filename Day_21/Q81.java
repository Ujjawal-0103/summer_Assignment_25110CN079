//Write a program to Find string length without strlen().

import java.util.Scanner;
public class Q81{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        //convert string to array of characters.
        char[] arr = str.toCharArray();

        int count = 0;
        for(char ch : arr){
            count++;        //update the count value.
        }

        System.out.print("Length of the input string is: " + count);
        sc.close();
    }
}

