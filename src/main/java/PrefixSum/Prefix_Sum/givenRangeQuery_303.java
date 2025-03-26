package PrefixSum.Prefix_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class givenRangeQuery_303 {
    class NumArray {
        public int arr[];

        public NumArray(int[] nums) { //  this is the constructor
            arr = Arrays.copyOf(nums,nums.length); // this is the shallow copy of the arrays
            for(int i = 1; i < nums.length; i++){
                arr[i] += arr[i - 1];
            }


        }

        public int sumRange(int left, int right) {
            if(right == 0)
                return arr[right];

            return arr[right] - arr[left - 1];
//            int sum = 0;
//            for(int i = left; i <= right; i++){ // calculate the starting index to ending index
//                sum += arr[i];     // calculate the arr i wala sum may add car do sum may
//            }
//            return sum; // than  return the values of

        }
    }

}
