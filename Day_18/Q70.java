//Write a program to Selection sort.

import java.util.Scanner;
public class Q70{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of the array: ");
        for(int i =  0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //check if size valid or not.
        if(size <= 0){
            System.out.print("Enter valid size.");
            sc.close();
            return;
        }
        
        for(int i = 0; i < size - 1; i++){
            int min = i;
            for(int j = i + 1; j < size; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            //Swap the elements.
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

