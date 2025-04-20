package String;

public class LeftMostchar {
//    public static int leftmost(String s){
//        int n = s.length();
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if(s.charAt(i) == s.charAt(j)){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
 static  final int CHAR =  256;
    public static  int leftMost(String str){
        boolean vis[] = new boolean[CHAR];
        int res = -1;
        for(int i = str.length() - 1; i >= 0;  i--){
            if(vis[str.charAt(i)])
                res = i;
            else
                vis[str.charAt(i)] = true;
        }
        return res;

    }
    public static void main(String[] args) {
        String str = "abcc";
        System.out.println(leftMost(str));
    }
}
