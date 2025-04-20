package two_D_arrays;

import java.util.Scanner;

public class FindtheMaximumofthearrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =  sc.nextInt();
        int [][] arr =  new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
             arr[i][j] =  sc.nextInt();
            }
        }


        int max =  Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                max = Math.max(max, arr[i][j]);

            }
        }
        System.out.println(max);
    }
}
