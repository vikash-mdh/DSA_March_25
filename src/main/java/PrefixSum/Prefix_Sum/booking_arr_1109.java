package PrefixSum.Prefix_Sum;

public class booking_arr_1109
{
    public int[] corpFlightBookings(int[][] arr, int n) {

        ///  this is the broughtForce apprcoh
//        int ans[] = new int[n];
//        for(int i = 0; i < arr.length; i++){
//            int first = arr[i][0];
//            int last = arr[i][1];
//            int set = arr[i][2];
//
//            for(int j = first -1; j <= last - 1; i++){
//                ans[j] += set;
//            }
//
//        }
//        return ans;

        ///  apprch is teh seconde

        int ans[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int set = arr[i][2];
            ans[first - 1] += set;
            if(last < n) ans[last] -= set;
        }
        for(int i = 1; i < n; i++){
            ans[i] += ans[i - 1];
        }
        return ans;


    }
}
