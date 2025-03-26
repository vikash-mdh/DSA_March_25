package Arrays;

import java.util.Scanner;

public class noOfzero {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1,0,1,1,1,0};
        int n = arr.length;
//        ///  approch is the frist (Arrays.sort());
//        int zero  = 0;
//       for(int i = 0; i < n; i++){
//           if(arr[i] == 0)
//               zero++;
//       }
//       for(int i = 0; i < n; i++){
//           if(i < zero)
//               arr[i] = 0;
//           else
//               arr[i] = 1;
//         }

        ///  approch 2

        int i = 0;
        int j = n - 1;
        while(i < j){
            if(arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }

        for(int num :  arr){
            System.out.print(num+" ");
        }


    }
}
