//Write a program to Remove spaces from string.

import java.util.Scanner;
public class Q88{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        int j = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                str.setCharAt(j, str.charAt(i));            //update the white space with the next character.
                j++;
            }
        }

        str.setLength(j);                   //update the length of the string.
        System.out.println("String after removing white spaces: ");
        System.out.print(str);

        sc.close();
    }
}

