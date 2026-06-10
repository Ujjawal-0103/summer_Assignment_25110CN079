//Write a program to Find x^n without pow().

import java.util.*;
public class Q24{
    public static int xPowerN(int x, int n){
        //If value of n becomes zero.
        if(n == 0){
            return 1;
        }

        //If value of x becomes zero.
        if(x == 0){
            return 0;
        }
        
        //Calculate value of function with half Power.
        int halfPower = xPowerN(x, n/2);

        if(n % 2 ==0){          //if n is even
            return halfPower * halfPower;
        }
        else{                  //if n is odd
            return halfPower * halfPower * x;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Take value of x as input.
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        
        //Take value of n as input.
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(xPowerN(x,n));   
    }
}

