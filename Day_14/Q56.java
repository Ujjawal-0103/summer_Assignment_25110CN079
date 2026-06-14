//Write a program to Find duplicates in array.

import java.util.Scanner;
public class Q56{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input size of the array.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        //Input elements of the array.
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        boolean duplicate = false;      //boolean duplicate is false as no duplicate found.

        for(int i = 0; i < size; i++){
            int count = 0;          //Initialize count = 0;

            for(int j = i+1; j < size; j++){
                if(arr[i] == arr[j]){       //Check if it has a duplicate.
                    count++;                //Update the count value.
                }
            }

            if(count > 0){                  //Check if it is a duplicate.
                boolean isPrinted = false;      //boolean isPrinted false as it is not printed yet.

                for(int k = 0; k < i; k++){     //tranverse from 0 to i.
                    if(arr[k] == arr[i]){       //check if the duplicate element has already been printed.
                        isPrinted = true;       //update the isPrinted to true.
                        break;
                    }
                }

                if(!isPrinted){                 //print the duplicate element.
                    if(!duplicate){
                        System.out.println("Duplicate elements are:");
                    }
                    System.out.print(arr[i] + " ");
                    duplicate = true;
                    
                }

            }
        }
        if(!duplicate){                         //check if no duplicates found.
            System.out.print("No duplicates found.");
        }
    }
}

