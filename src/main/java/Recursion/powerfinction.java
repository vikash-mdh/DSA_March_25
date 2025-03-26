package Recursion;

import java.util.Scanner;

public class powerfinction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("power");
        int a = sc.nextInt();
        System.out.println("base ");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }

    private static int power(int a, int b) {
        if(b == 0) return 1;
        return a * power(a, b -1);
    }
}
