package Arrays;

import java.util.Scanner;

public class ThreeGreatCondition {

//    ------ appproch 1 ----
//    static int max_product(int [] arr){    //  Time complicity O(n3)
//        int n = arr.length;                // Space complicity O(1)
//        int max_pro = Integer.MIN_VALUE;
//        for(int i = 0; i < n - 2; i++){
//            for(int j = i + 1; j < n - 1; j++){
//                for(int k = j + 1; k < n; k++){
//                    max_pro = Math.max(max_pro,arr[i]* arr[j]* arr[k]);
//
//                }
//            }
//        }
//        return max_pro;
//    }



//    -- --- approch 2   -----
//static int max_product(int[] arr) {
//    int n = arr.length;
//    Arrays.sort(arr);
//
//    int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3]; // Three largest numbers
//    int product2 = arr[0] * arr[1] * arr[n - 1]; // Two smallest (negative) and largest

    // Step 3: Return the maximum product
//        return Math.max(product1, product2);
// }
    static int max_product(int[] arr) {
    int n = arr.length;
    int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
    // Initialize Minimum and second minimum element
    int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        // Update Maximum, second maximum
        // and third maximum element
        if (arr[i] > maxA) {
            maxC = maxB;
            maxB = maxA;
            maxA = arr[i];

        } else if (arr[i] > maxB) {
            maxC = maxB;
            maxB = arr[i];

        } else if (arr[i] > maxC) {
            maxC = arr[i];
        }
        // Update Minimum and second minimum element
        if (arr[i] < minA) {
            minB = minA;
            minA = arr[i];
        } else if (arr[i] < minB) {
            minB = arr[i];
        }
    }

    return Math.max(minA * minB * maxA, maxA * maxB * maxC);
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       int result =   max_product(arr);
        System.out.println(result);

    }
}
