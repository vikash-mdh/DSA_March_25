package String;

import java.util.Stack;

public class reversewordwise {
    static void reverse(char str[],int low, int high){
        while(low<=high){
            //swap
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            //
            low++;
            high--;
        }
    }
    static void reverseWords(char str[],int n){
        int start=0;
        for(int end=0;end<n;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
//    public static String revword(String str){
//        Stack<String> stack = new Stack<>();
//
//        // Step 1: Split the string by spaces
//       String[] words = str.trim().split("\\s+");
//
//        // Step 2: Push all words onto the stack
//        for (String word : words ) {
//            stack.push(word);
//        }
//
//        // Step 3: Pop words from stack and build reversed string
//        StringBuilder reversed = new StringBuilder();
//        while (!stack.isEmpty()) {
//            reversed.append(stack.pop());
//            if (!stack.isEmpty()) {
//                reversed.append(" ");
//            }
//        }
//
//        return reversed.toString();
//    }
    public static void main(String[] args) {
        String str = "I Love Coding";
        System.out.println();
    }
}
