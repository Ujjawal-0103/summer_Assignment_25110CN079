//Write a program to Count words in a sentence.

import java.util.Scanner;
public class Q86{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i-1) == ' ')){
                count++;
            }
        }
        
        System.out.print("Number of words in the sentence is: " + count);
        sc.close();
    }
}

