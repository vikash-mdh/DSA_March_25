package Arrays;

import java.util.Scanner;


public class SecLargestElement {
//    static int getSecondLargest(int[] arr) {
//        int n = arr.length;
//        Arrays.sort(arr);
//        for (int i = n - 2; i >= 0; i--) {
//            if (arr[i] != arr[n - 1]) {
//                return arr[i];
//            }
//        }
//        return -1;
  //  }

    public static int secLargest(int [] arr){
        int n = arr.length;
        int largest = -1;
        int seclargest = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] >  largest){
                seclargest = largest;
                largest =  arr[i];
            } else if (arr[i] < largest && arr[i] > seclargest) {
                seclargest = arr[i];
                
            }

        }

        return seclargest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(getSecondLargest(arr));
        System.out.println(secLargest(arr));
    }
}
