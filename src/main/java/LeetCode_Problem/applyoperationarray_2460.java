package LeetCode_Problem;

import java.util.Scanner;
import java.util.Arrays;

public class applyoperationarray_2460 {

    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0) {
                if (nums[i] == nums[i + 1]) {
                    result[count] = nums[i] * 2;
                    i++;
                } else {
                    result[count] = nums[i];
                }
                count++;
            }
        }
        if (i == nums.length - 1 && nums[i] != 0) {
            result[count] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        applyoperationarray_2460 obj = new applyoperationarray_2460();
        int[] result = obj.applyOperations(nums);

        System.out.println("Resultant array: " + Arrays.toString(result));

        scanner.close();
    }
}
