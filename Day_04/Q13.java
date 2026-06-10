//Write a program to Generate Fibonacci series.

import java.util.*;
public class Q13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print: ");
        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        System.out.println("Fabonacci Series:");
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for(int i = 0; i < num-2; i++){
            int temp = n1 + n2;
            System.out.print(temp + " ");
            n1 = n2;
            n2 = temp;
            
        }
    }
}