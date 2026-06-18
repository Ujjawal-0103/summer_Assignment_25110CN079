//Write a program to Bubble sort.

import java.util.Scanner;
public class Q69{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        //check if size valid or not.
        if(size <= 0){
            System.out.print("Enter valid size.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    //swap the elements.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

