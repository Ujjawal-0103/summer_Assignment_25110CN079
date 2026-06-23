//Write a program to Find maximum occurring character.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q92{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        if(str.isEmpty()){
            System.out.print("String is Empty.");
            sc.close();
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            int freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);

            if(freq > max){
                max = freq;
            }
        }

        System.out.println("Maximum occuring character(s) is/are:");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                System.out.print(entry.getKey() + " ");
            }
        }
        sc.close();
    }
}

