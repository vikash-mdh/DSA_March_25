package Recursion;

import java.util.Scanner;

public class fibnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the fib_number");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n -2);
    }
}
