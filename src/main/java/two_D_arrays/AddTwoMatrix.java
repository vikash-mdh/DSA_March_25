package two_D_arrays;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare the arrays
        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];

        // Input for first array
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for second array and directly add to arr1
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
                arr1[i][j] += arr2[i][j]; // Directly add into arr1
            }
        }

        // Display result
        System.out.println("Sum of the two arrays is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }



        ///  this is the brought force approch

//                Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the frist arrays");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[][] = new int[n][m];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the Second arrray ");
//        int b[][] = new int[n][m];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                b[i][j] = sc.nextInt();
//
//            }
//        }
//
//        //int res[][]  = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                b[i][j] += a[i][j]; // + b[i][j];
//            }
//        }
//
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
