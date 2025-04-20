package String;
import java.util.Scanner;

public class reverseString {

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();  // Taking input as String
        char[] ch = input.toCharArray();  // Convert String to char array

        reverseString rs = new reverseString();  // Create object to call non-static method
        rs.reverseString(ch);

        // Print reversed char array as string
        System.out.print("Reversed string: ");
        System.out.println(new String(ch));  // Convert char array back to String
    }
}
