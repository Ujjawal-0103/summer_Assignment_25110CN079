//Write a program to Count vowels and consonants.

import java.util.Scanner;
public class Q83{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int vowelCount = 0, consonantCount = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // if( ch >= 'a' && ch <= 'z'){
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.print("Consonant Count: " + consonantCount);

        sc.close();
    }
}

