package BinarySerch;


import java.util.*;

public class BinarySqrt {
    public static void sqrt(int n){
       long start = 1;
       long end = n;
       long ans = -1;
       while (start <= end){

           long mid = (start + end)/2;
           if(mid * mid <= n){

               ans = Math.max(ans,mid);
               start = mid + 1;
           }else{
               end = mid - 1;
           }

       }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sqrt(n);

    }
}
