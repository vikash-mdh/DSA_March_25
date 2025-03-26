package BinarySerch;

import java.util.Scanner;

public class BasicSerch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        // this is the target element
        int target = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int ans = -1;
        // the serch space reduce is every time reduce 2 times
        // N -> N/2, N/4, N/8, ......log N space
        while (start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                ans = mid; // we can found the element
                break;
            }else if(target < arr[mid]){ // target <  mid serch on the left side
                end = mid - 1;

            }else{
                start = mid + 1; // target on right side
            }
        }
        System.out.println(ans);
    }
}
