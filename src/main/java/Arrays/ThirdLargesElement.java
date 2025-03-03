package Arrays;


import java.util.Scanner;

public class ThirdLargesElement {
//    3 ----- approch -----
static int thirdLargest(int[] arr) {
    int n = arr.length;

    // Find the first maximum element.
    int first = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        if (arr[i] > first) first = arr[i];
    }

    // Find the second max element.
    int second = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        if (arr[i] > second && arr[i] < first) {
            second = arr[i];
        }
    }

    // Find the third largest element.
    int third = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        if (arr[i] > third && arr[i] < second) {
            third = arr[i];
        }
    }

    // Return the third largest element
    return third;
}





//    static int thirdLargest(int[] arr) {
//        int n = arr.length;
////       1 ----- approch---
//        Arrays.sort(arr);
//        return arr[n - 3];


//2 ----- approchSecond ------

//        int frist = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//        int third = Integer.MIN_VALUE;
//        for(int i = 0; i  < n; i++){
//            if(arr[i] > frist){
//                third = second;
//                second = frist;
//                frist = arr[i];
//
//            } else if (arr[i] > second) {
//                third = second;
//                second = arr[i];
//
//
//            } else if (arr[i] > third) {
//                third = arr[i];
//
//            }
//
//        }
//        return third;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i  < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(thirdLargest(arr));
    }

}
