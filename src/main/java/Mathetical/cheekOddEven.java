package Mathetical;

import java.util.Scanner;

public class cheekOddEven {
    static String oddEven(int n ){
        if(n % 2 == 0)
            return "Even Number";
        else
            return "Odd Number";


//          return (n&1) == 0; // this is the boolean ka case may hoga
//          return (n % 2 == 0); // this is the frist approch
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        System.out.println(oddEven(n));
    }
}
