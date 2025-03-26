package PrefixSum.Prefix_Sum;

public class product_238 {
    // pre[i] = nums[i - 1] * pre[i - 1]; This is the prefix sum frumula
    //

        public int[] productExceptSelf(int[] nums) {
            ///  approch is the frist
//            int n =  nums.length;
//            int pre[] = new int[n];
//            pre[0] = 1;
//            for(int i = 0; i < n; i++){
//                pre[i] = nums[i - 1] * pre[i - 1];
//            }
//            int suffix[] = new int[n];
//            suffix[n - 1] = 1;
//            for(int i = n - 1; i >= 0; i--){
//                suffix[i] = nums[i + 1] * suffix[i + 1];
//            }
//            int ans[] = new int[n];
//            for(int i = 0; i < n; i++){
//                ans[i] = pre[i] * suffix[i];
//            }
//            return ans;

  ///  approch is the second
//            int n =  nums.length;
//            int pre[] = new int[n];
//            pre[0] = 1;
//            for(int i = 0; i < n; i++){
//                pre[i] = nums[i - 1] * pre[i - 1];
//            }
//            int suffix[] = new int[n];
//            suffix[n - 1] = 1;
//            for(int i = n - 1; i >= 0; i--){
//                suffix[i] = nums[i + 1] * suffix[i + 1];
//            }
//
//            for(int i = 0; i < n; i++){
//                pre[i] = pre[i] * suffix[i];
//            }
//            return pre;

            //// approch is the third in the giveen arrays

            int n =  nums.length;
            int pre[] = new int[n];
            pre[0] = 1;
            for(int i = 0; i < n; i++){
                pre[i] = nums[i - 1] * pre[i - 1];
            }
            int suffix = 1;
            for(int i = n - 1; i >= 0; i--){
                suffix  *= nums[i+1];
                pre[i] *= suffix;
            }

            return pre;



    }

}
