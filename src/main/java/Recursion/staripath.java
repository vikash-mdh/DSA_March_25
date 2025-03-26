package Recursion;

import java.util.Scanner;

public class staripath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stair(n));
    }

    private static int stair(int n) {
        if(n <= 2){
            return n;
        }
        return stair(n - 1) + stair(n - 2);
    }
}
