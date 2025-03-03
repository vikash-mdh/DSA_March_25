package Sorting.bubblesort_1;

import java.util.Scanner;
import java.util.*;

public class bubblesort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                // This is the cheek arr[j] agar bada hoga to arr[j] ko update car dega
                if(arr[j] > arr[j + 1]){

                    // This is the swap function
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
       }
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));




    }
}
