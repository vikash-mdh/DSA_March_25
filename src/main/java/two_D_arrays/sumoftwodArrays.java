package two_D_arrays;

import java.util.Scanner;

public class sumoftwodArrays {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int [n][m];

        for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                 arr[i][j] =  sc.nextInt();
             }
        }


        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
                //System.out.print(arr[i][j]+" ");
            }

        }
        System.out.println(sum);
    }
}
