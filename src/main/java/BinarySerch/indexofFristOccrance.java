package BinarySerch;

import java.util.*;

public class indexofFristOccrance {
    public static int idxoffristOccrance(int arr[],int n, int tag){
        int start = 0;
        int end = n - 1;
        int ans = n;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == tag){
                ans = Math.min(ans,mid);
                end = mid - 1;
            }else if(tag < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if(ans == n){
            ans = -1;
        }
        return ans;
    }
    public static int idxofLastOccrance(int arr[], int n, int tag){
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == tag){
                ans = Math.max(ans,mid);
                start = mid + 1;
            }else if(tag < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void findPosition(int []arr,int n, int tag ){
        System.out.println(idxoffristOccrance(arr,n,tag) + " "+ idxofLastOccrance(arr,n,tag));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tag =  sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        findPosition(arr, n, tag);

    }
}
