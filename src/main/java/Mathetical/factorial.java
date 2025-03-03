package Mathetical;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factort(n));
    }


  // this the recursive mode
    private static int factort(int n) {
        if(n == 0){
            return 1;
        }
        return n * factort(n - 1);
    }

    // this is the iteration loop
//    public static int factort(int n) {
//        int res = 1;
//        for(int i = 1; i <= n; i++){
//            res = res * i;
//        }
//        return res;
//    }
}
