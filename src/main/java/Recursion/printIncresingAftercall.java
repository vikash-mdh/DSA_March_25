package Recursion;

import java.util.Scanner;

public class printIncresingAftercall {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if(n == 0) return;
        System.out.println(n);
        print(n - 1);
        System.out.println(n);

    }
}
