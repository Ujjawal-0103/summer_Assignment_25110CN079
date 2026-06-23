//Write a program to Find first non-repeating character.

import java.util.HashMap;
import java.util.Scanner;
public class Q89{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(map.get(ch) == 1){
                System.out.print("First non-repeating character is: " + ch);
                sc.close();
                return;
            }
        }

        System.out.print("Every character is repeating.");
        sc.close();
    }
}

