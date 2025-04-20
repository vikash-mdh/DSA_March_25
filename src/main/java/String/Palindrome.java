package String;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        for(int i = str.length() - 1; i >= 0;  i--){
            rev.append(str.charAt(i));
        }
            if(str.equals(rev.toString())){
                System.out.println("This is the palindrome");
            }else{
                System.out.println("This is not a palindrome");
            }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        palindrome(str);


    }
}
