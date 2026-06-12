//Write a program to Write function for Fibonacci.

import java.util.Scanner;
public class Q47{
    public static void fibonacci(int num){
        if(num <= 0){
            System.out.println("Please enter valid number of term.");
            return;
        }

        int term1 = 0;      //Initialize term 1.
        int term2 = 1;      //Initialize term 2.

        System.out.println("Fabonacci Series:");

        if(num == 1){
            System.out.print(term1 + " ");      //Print term 1.
            return;
        }

        System.out.print(term1 + " ");      //Print term 1.
        System.out.print(term2 + " ");      //print term 2.

        //for printing remaining terms.
        for(int i = 0; i < num-2; i++){
            int temp = term1 + term2;          //update the value of next term.
            System.out.print(temp + " ");
            term1 = term2;
            term2 = temp;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input number of terms you want to print.
        System.out.print("Enter the number of terms you want to print: ");
        int num = sc.nextInt();

        //Call function.
        fibonacci(num);
    }
}

