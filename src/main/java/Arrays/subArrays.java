package Arrays;

public class subArrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        long maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println(maxSum);
//        for(int i = 0; i <= n; i++){
//            for(int j = i; j < n; j++){
//                for(int k = i;  k <= j; k++){
//                    System.out.print(arr[k]);
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
    }
}
