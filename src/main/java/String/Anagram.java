package String;
import  java.util.*;
import java.util.Scanner;

public class Anagram {
   public static boolean anagra(String s1,String s2){
       if(s1.length() != s2.length()){
           return false;
       }
       char a[] = s1.toCharArray();
       Arrays.sort(a);
       s1 = new String(a);

       char b[] = s1.toCharArray();
       Arrays.sort(b);
       s2 = new String(b);

       return s1.equals(s2);
   }
    public static void main(String[] args) {
        String str1 = "abaac";
        String str2 = "aacba";
        if (anagra(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}


