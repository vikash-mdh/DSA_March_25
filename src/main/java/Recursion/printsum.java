package Recursion;

import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return n + sum(n-1);
    }
}
