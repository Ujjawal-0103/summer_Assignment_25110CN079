//Write a program to Convert lowercase to uppercase.

import java.util.Scanner;
public class Q84{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                str.setCharAt(i, (char)(ch - 'a' + 'A'));
            }
        }

        System.out.println(str);

        sc.close();
    }
}

