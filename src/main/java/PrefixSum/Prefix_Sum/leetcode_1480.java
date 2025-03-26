package PrefixSum.Prefix_Sum;

public class leetcode_1480 {

    // prefix sum approch
    // This code is the Timecomplicity is the bigOf(n) and SpaceCmplicity is the BigOf(n) hai
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int prefix[] = new int [n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = nums[i] +  prefix[i - 1];
        }
        return prefix;
    }



    // brought force approch for for loop
    // Time complicity is the Oof(n)
//    public int[] runningSum(int[] nums) {
//        int n = nums.length;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//            nums[i] = sum;
//        }
//        return nums;
//    }
}
