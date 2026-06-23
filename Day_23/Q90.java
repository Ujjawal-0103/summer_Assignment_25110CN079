//Write a program to Find first repeating character.

import java.util.HashSet;
import java.util.Scanner;
public class Q90{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(set.contains(ch)){
                System.out.print("First repeating character is: " + ch);
                sc.close();
                return;
            }

            set.add(ch);
        }

        System.out.print("Every character is unique.");
        sc.close();
    }
}

