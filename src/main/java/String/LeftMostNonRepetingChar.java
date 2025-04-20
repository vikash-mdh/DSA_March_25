package String;
import java.util.*;
public class LeftMostNonRepetingChar {
    ///  this is the approch is the frist
//    final  static int ch =  256;
//    public static int isleft(String str) {
//        int[] cnt = new int[ch];
//        for (int i = 0; i < str.length(); i++) {
//            cnt[str.charAt(i)]++;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (cnt[str.charAt(i)] == 1)
//                return i;
//        }
//        return -1;
//    }
    ///  this is the approch is the second

    static final int CHAR=256;
    static int nonRep(String str)
    {
        int[] fI=new int[CHAR];
        Arrays.fill(fI,-1);

        for(int i=0;i<str.length();i++){
            if(fI[str.charAt(i)]==-1)
                fI[str.charAt(i)]=i;
            else
                fI[str.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++){
            if(fI[i]>=0)res=Math.min(res,fI[i]);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(nonRep(str));
    }
}
