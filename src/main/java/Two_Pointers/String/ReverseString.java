package Two_Pointers.String;

import java.util.*;

public class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;

        // Use a for loop to iterate from the beginning of the array to the middle
        for (int i = 0; i < n / 2; i++) {

            // Store the character at position i
            char temp = s[i];
            // Place the character from the end at position i
            s[i] = s[n - 1 - i];
            // Assign the stored character to the end position
            s[n - 1 - i] = temp;
        }
    }


            // this is the frist approch is brough force
//        int left = 0, right = s.length - 1;
//        while (left < right) {
//            // Swap characters
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//
//            left++;
//            right--;
//        }
//    } // **Missing bracket added here**

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        char[] ch = input.toCharArray(); // Convert string to character array

        reverseString(ch); // Call the function to reverse the string

        System.out.println("Reversed string: " + new String(ch)); // Print the reversed string

        sc.close(); // Close scanner to prevent resource leak
    }
}
