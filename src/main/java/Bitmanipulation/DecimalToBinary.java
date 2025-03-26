package Bitmanipulation;

import java.util.Scanner;

public class DecimalToBinary {
    static String decToBinary(int n){
//        StringBuilder str = new StringBuilder();
//        if (n == 0)
//            return "0"; // Edge case
//
//        while (n > 0) {
//            str.insert(0, n % 2); // Prepend remainder to the result
//            n = n / 2;
//        }
//        return str.toString();


        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return decToBinary(n / 2) + (n % 2);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decToBinary(n));
    }
}
