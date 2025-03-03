package Sorting.insertionsort_3;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsortcode {
    public static void insertion(int []arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i  = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        insertion(arr);
        System.out.println("insertion sort" + Arrays.toString(arr));

    } 
}
