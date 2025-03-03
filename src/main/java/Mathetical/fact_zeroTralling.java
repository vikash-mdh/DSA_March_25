package Mathetical;

import java.util.Scanner;

public class fact_zeroTralling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tralling_zero_fac_cnt(n));
    }

    private static int tralling_zero_fac_cnt(int n) {
        int res = 0;
        for(int i = 5; i <= n; i = i * 5){
            res = res + n / i;
        }
        return res;


//    public static int tralling_zero_fac_cnt(int fac) {
//        int fact = 1;
//        for(int i = 2; i <= fac; i++){
//            fact = fact * i;
//        }
//        int res = 0;
//        while (fact % 10 == 0){
//            res++;
//            fact = fact / 10;
//        }
//        return res;
    }
}
