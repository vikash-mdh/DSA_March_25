package Sorting.selectionsort_2;

import java.util.Arrays;
import java.util.Scanner;

public class selectiosort {

    public static void selectionsortt(int []arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       selectionsortt(arr);
        System.out.println("selection sort" + Arrays.toString(arr));
    }
}
