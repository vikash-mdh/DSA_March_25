package BinarySerch;


import java.util.*;

public class FloorInSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tag = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] <= tag){
                ans = Math.max(ans, mid);
                start = mid + 1; // move to the right
            }else{
                end = mid - 1; // move to the left
            }
        }
        System.out.println(ans);
    }
}

