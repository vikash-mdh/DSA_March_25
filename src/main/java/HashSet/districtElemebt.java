package HashSet;

import java.util.HashSet;

public class districtElemebt {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
            h.add(reverse(nums[i])); // Calling the reverse function
        }
        return h.size();
    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            rev = rev * 10 + d;
        }
        return rev;
    }

    public static void main(String[] args) {
        int nums[] = {1, 12, 24, 31, 46}; // Sample input

    }
}
