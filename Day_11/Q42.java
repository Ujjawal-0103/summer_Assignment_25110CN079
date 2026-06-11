//Write a program to Write function to find maximum.

import java.util.Scanner;
public class Q42{
    public static int max(int num1, int num2){
        //check for the maximum number.
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //input 1st number.
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        //Input 2nd number.
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        //Calling the function and printing the output.
        System.out.println("Maximum of the two numbers is: " + max(num1, num2));
    }
}