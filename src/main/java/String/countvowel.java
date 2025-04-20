package String;

import java.util.Scanner;

public class countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        int n = str.length();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) { // semicolon hata diya and {} lagaye
                cnt++;
            }
        }
        System.out.println("Total vowels: " + cnt);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'a') return true;
        if (ch == 'E' || ch == 'e') return true;
        if (ch == 'I' || ch == 'i') return true;
        if (ch == 'O' || ch == 'o') return true;
        if (ch == 'U' || ch == 'u') return true;
        return false;
    }
}
