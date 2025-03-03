package LeetCode_Problem;

import java.util.Scanner;

public class Fac_tralling_zer_172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countTrallingleetcode(n));
    }

    private static int countTrallingleetcode(int n) {
        int res = 0;
        for(int i = 5; i <= n; i = i * 5){
            res = res + n / i;
        }
        return res;
//        hello
    }
}
