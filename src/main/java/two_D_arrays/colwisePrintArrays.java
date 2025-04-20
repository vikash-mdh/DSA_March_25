package two_D_arrays;

import java.util.Scanner;

public class colwisePrintArrays {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][] arr = new int[n][m];

        int arr[][] = {{1,2},{3,4},{5,6}};
        int n = arr.length;
        int m = arr[0].length;


//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
        }


        System.out.println();

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
