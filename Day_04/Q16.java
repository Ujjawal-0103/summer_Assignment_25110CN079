//Write a program to Print Armstrong numbers in a range.

import java.util.*;
public class Q16{
    public static void armstrong(int start, int end){
        boolean found = false;
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for(int i = start; i <= end; i++){
            if(i == 0){
                System.out.print(i + " ");
                continue;
            }
            int digit = 0;
            int temp = i;

            while(temp > 0){
                digit++;
                temp /= 10;
            }

            temp = i;

            int rem = 0;
            while(temp > 0){
                rem = rem + (int)Math.pow((temp%10),digit);
                temp /= 10;
            }

            if(i == rem){
                System.out.print(i + " ");
                found = true;
            }
        }

        if(!found){
            System.out.println("No Armstrong number found in this range.");
        }        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        armstrong(start, end);
    }
}