package PrefixSum.Prefix_Sum;

public class pivot_724 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            if (i > 0) {
                leftSum = nums[i - 1];
            }
            int rightSum = nums[n - 1] - nums[i];
            if (leftSum == rightSum) {
                return i;
            }

        }
        return -1;
    }
}
// Brught force approch the leetcode problem

//        int n = nums.length;
//        for(int i = 0; i < n; i++){
//            int leftSum = 0;
//            int rightSum = 0;
//
//            for(int j = 0; j < i; j++){
//                leftSum += nums[j];
//            }
//
//            for(int j = i + 1; j < n; j++){
//                rightSum += nums[j];
//            }
//            if(leftSum == rightSum){
//                return i;
//            }
//            return -1;
