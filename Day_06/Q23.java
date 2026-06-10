//Write a program to Count set bits in a number.

import java.util.*;
public class Q23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Take number as input;
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int setBits = 0;
        while(num > 0){
            //Check if the last digit is setbit or not.
            if((num & 1) == 1) {
                setBits++;
            }
            num >>= 1;
        }

        System.out.println("Number of set bits is/are: " + setBits);
    }
}

