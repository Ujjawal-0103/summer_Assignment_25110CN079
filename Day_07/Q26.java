//Write a program to Recursive Fibonacci.

import java.util.*;
public class Q26{
    public static void fibonacci(int term1, int term2, int n){
        //Base condition.
        if(n == 0){
            return;
        }

        int temp = term1 + term2;           //Update the value of next term.
        System.out.print(temp + " ");       //Print the next term.
        fibonacci(term2,temp,n-1);          //Call the recursive function.
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input the number of terms to be printed.
        System.out.print("Enter the number of terms you want to print: ");
        int n = sc.nextInt();
        
        int term1 = 0;                      //Initialize term 1.
        int term2 = 1;                      //Initialize term 2.
        System.out.println("Fibonacci Series:");
        System.out.print(term1 + " ");      //Print term 1.
        System.out.print(term2 + " ");      //Print term 2.
        
        //Call the function.
        fibonacci(term1, term2, n-2);
    }
}

