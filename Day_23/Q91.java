//Write a program to Check anagram strings.

import java.util.HashMap;
import java.util.Scanner;
public class Q91{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String str_1 = sc.nextLine();

        System.out.print("Enter the string 2: ");
        String str_2 = sc.nextLine();

        if(str_1.length() != str_2.length()){
            System.out.print("Strings are not anagram.");
            sc.close();
            return;
        }

        str_1 = str_1.toLowerCase();
        str_2 = str_2.toLowerCase();
        int len = str_1.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            char ch = str_1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < len; i++){
            char ch = str_2.charAt(i);

            if(!map.containsKey(ch)){
                System.out.print("Strings are not anagram.");
                sc.close();
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        if(map.isEmpty()){
            System.out.print("Strings are anagram.");
        }
        else{
            System.out.print("Strings are not anagram.");
        }

        sc.close();
    }
}

