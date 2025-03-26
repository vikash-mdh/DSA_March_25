package Arrays;

import java.util.Scanner;

public class revArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = temp;
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }


        System.out.println();
    }
}
