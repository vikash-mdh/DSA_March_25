package Mathetical;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cheeckPalindreom(n));

    }

     static boolean cheeckPalindreom(int n) {
        int rev = 0; // create a reverse
        int temp = n; // assine the temp value
        while(temp != 0){ // jabtak khali na ho gay tab tak loop chelaga
            int ld = temp % 10;  // ise loop say last digit nicak car last digit may store carega
            rev = rev * 10 + ld;  // reveser
            temp = temp / 10;

        }
        return (rev == n);
    }
}
