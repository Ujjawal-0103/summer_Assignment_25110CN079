//Write a program to Find nth Fibonacci term.

import java.util.*;
public class Q14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the term you want to know: ");
        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        if(num == 1){
            System.out.println(num + "term of Fabonacci series is: " + n1);
        }
        else if(num == 2){
            System.out.println(num + "term of Fabonacci series is: " + n2);
        }
        else if(num > 2){
            int temp = n1 + n2;
            for(int i = 0; i < num-2; i++){
                temp = n1 + n2;
                n1 = n2;
                n2 = temp;
            }
            System.out.println(num + " term of Fabonacci series is: " + temp);
        }
        else{
            System.out.println("Enter a valid positive number of term.");
        }
    }
}