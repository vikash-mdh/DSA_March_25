package Arrays;

public class sumofuniqueElement {

    public static int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int cnt[] = new int[101];

        for (int num : nums) {
            cnt[num]++;
        }
        for (int num : nums) {
            if (cnt[num] == 1)
                sum += num;
        }
        return sum;
    }

        public static void main(String[] args) {
        int arr[] = {1,2,3,7};
            System.out.println(sumOfUnique(arr));

    }
}
