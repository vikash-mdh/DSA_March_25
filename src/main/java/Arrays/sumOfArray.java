package Arrays;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfarrays(arr));
    }

    private static int sumOfarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
