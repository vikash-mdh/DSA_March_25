package Recursion;

import java.util.Scanner;

public class Print_sum_one_two_n {
    public static void sum(int n, int s){
        if(n == 0) {
            System.out.println(s);
            return;
        }
        sum( n - 1, s + n);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       sum(0, n);

    }
}
