package Arrays;

public class sortZeroOne {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,0,1,0,1,0,1,0};
        int n = arr.length;

//        int zero = 0;
//        for(int i = 0; i < n; i++){
//            if(arr[i] == 0) zero++;
//        }
//        for(int i = 0; i < n; i++){
//            if(i < zero)
//                arr[i] = 0;
//            else
//                arr[i] = 1;
//        }
//        for(int ele :  arr){
//            System.out.print(ele+ " ");
//        }

        int i = 0;
        int j = n - 1;

        while(i < j){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            if(i > j)
                break;
            if(arr[i] == 1 && arr[j] == 0){ // this loop work is in case arr i == 1 and arr j  == 0 than swap value
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
