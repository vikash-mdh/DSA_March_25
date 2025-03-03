package Matrix;

import java.util.Scanner;

public class OneDToTwoD {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0]; // Return an empty 2D array if dimensions don't match
        }

        int arr[][] = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            arr[i / n][i % n] = original[i]; // Directly calculating row and col
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int o = sc.nextInt();
        int arr[] = new int[o];

        // Input elements
        for (int i = 0; i < o; i++) {
            arr[i] = sc.nextInt();
        }

        // Input dimensions for 2D array
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] result = construct2DArray(arr, m, n);

        // Print the 2D array
        if (result.length == 0) {
            System.out.println("[]"); // If array couldn't be formed
        } else {
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        sc.close(); // Closing the scanner
    }
}
