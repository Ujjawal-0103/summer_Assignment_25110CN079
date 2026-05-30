//Write a program to multiplicationPrint  table of a given number.

import java.util.*;
public class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(num + " " +  "*" + " " + i + " " + "=" + " " + num*i);
        }
    }
}

