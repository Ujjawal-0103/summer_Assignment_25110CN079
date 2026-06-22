//Write a program to Character frequency.

import java.util.Scanner;
public class Q87{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character whose frequency to be found: ");
        char target = Character.toLowerCase(sc.next().charAt(0));

        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){           //check if the element matches.
                count++;                                    //update the count value.
            }
        }

        System.out.print("Frequency of " + target + " is: " + count);
        sc.close();
    }
}

