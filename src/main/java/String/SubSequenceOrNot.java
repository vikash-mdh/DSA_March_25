package String;

import java.util.Scanner;

public class SubSequenceOrNot {
//    public static boolean isCheckSub(String a, String  b){
//        int n = a.length();
//        int m = b.length();
//        int j = 0;
//        for(int i = 0; i < n && j < m; i++){
//           if(a.charAt(i) == b.charAt(j))
//               j++;
//        }
//        return j == m;
//
//    }
static boolean isSubSeq(String s1, String s2, int n, int m){
    if( m == 0 )
        return true;

    if( n == 0 )
        return false;

    if ( s1.charAt(n-1) == s2.charAt(m-1) )
        return isSubSeq(s1, s2, n-1, m-1);

    else
        return isSubSeq(s1, s2, n-1, m);
}

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isSubSeq(s1, s2, n, m));
    }
}
