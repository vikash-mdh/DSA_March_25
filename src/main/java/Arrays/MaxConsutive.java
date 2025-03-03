package Arrays;

import java.util.Scanner;

public class MaxConsutive {
    static int maxConsecutiveCount(int[] arr) {
        int n = arr.length; // base case
        if(n == 0) return 0;
        int max = 0, cnt = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[ i - 1]){
                cnt++;
            }else {
                max = Math.max(max,cnt);
                cnt = 1;

            }
        }
        return Math.max(max,cnt);

        //    if (arr.length == 0)
//            return 0; // Handle edge case
//
//        int maxCount = 0, count = 0, prev = -1;
//
//        for (int num : arr) {
//            // If the current number is the same as the previous number
//            if ((prev ^ num) == 0) {
//                count++;
//            } else {
//                // Update maxCount and reset count
//                maxCount = Math.max(maxCount, count);
//                count = 1;
//            }
//            prev = num;
//        }

        //return Math.max(maxCount, count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;  i < n; i++){
            arr[i] = sc.nextInt();

        }
        int res = maxConsecutiveCount(arr);
            System.out.println(res);
    }
}
