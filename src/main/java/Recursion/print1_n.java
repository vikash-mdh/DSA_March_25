package Recursion;

import java.util.Scanner;

public class print1_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        print(1);
    }
    static  int n;
    private static void print(int x) {
        if(x > n) return; // base case
        System.out.println(x); // work
        print(x+1); // function call


    }
}
