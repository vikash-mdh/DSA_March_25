package Arrays;

public class nextGratestElement {
    public static void main(String[] args) {
        int arr[] = {12,8,41,37,2,49,16,28,21};
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        int n = arr.length;
 // this is the method one
        int ans[] = new int[n];
//        ans[n - 1] = -1;
//        for(int i = 0; i < n - 1; i++){
//            int max = Integer.MIN_VALUE;
//            for(int j = i; j < n; j++){
//                max = Math.max(max,arr[j]);
//
//            }
//            ans[i] =  max;
//        }


        // this is the method 2
        int nge = arr[n -1];
        for(int i = n - 2; i >= 0; i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }

        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
