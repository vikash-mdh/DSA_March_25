package Mathetical;

import java.util.Scanner;

public class Hcf_Lcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf_lcm(a,b));


    }

//    public static int hcf_lcm(int a, int b) {
//        while ( a!= b){
//            if(a > b){
//                a = a - b;
//            }else
//                b = b - a;
//        }
//        return a;
//    }


    public static int hcf_lcm(int a, int b) {
        int res = Math.max(a, b);
        while (res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;
        }

        return res;
    }
}
