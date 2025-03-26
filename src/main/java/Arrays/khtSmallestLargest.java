package Arrays;

import java.util.*;

import static java.util.Arrays.sort;

public  class khtSmallestLargest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 9, -6, -2, 12};
        int k = 4;

        System.out.println(kthSmallest(arr, k));
        System.out.println(findKthLargest(arr,k));

    }

    ///  approch is the frist
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int num : arr){
//            pq.add(num);
//        }
//        for(int i = 0; i < k - 1; i++){
//            pq.remove();
//        }


//        Arrays.sort(arr); /// this is the arrays is sorted from
//        return arr[k - 1]; /// in this case is k is the my value aur 1 is the my

    ///  approch is the second is the  max_heap

    public  static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k)
                pq.remove();
        }
//        System.out.println(pq.peek()); /// time complicity is o(nlogK)
        return pq.remove();
    }


    ///  this is the min_heap
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> lg = new PriorityQueue<>();
        for(int ele : nums){
            lg.add(ele);
            if(lg.size() > k)
                lg.remove();
        }
             return lg.peek();
    }
}