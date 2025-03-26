package PrefixSum.Prefix_Sum;

public class shop_2483 {

    public class Solution {
        public int bestClosingTime(String customers) {
            int n = customers.length();
            int minPenalty = Integer.MAX_VALUE;
            int bestHour = 0;

            for (int t = 0; t <= n; t++) {
                int penalty = 0;

                for (int i = 0; i < t; i++) {
                    if (customers.charAt(i) == 'N') {
                        penalty++;
                    }
                }

                for (int i = t; i < n; i++) {
                    if (customers.charAt(i) == 'Y') {
                        penalty++;
                    }
                }

                if (penalty < minPenalty) {
                    minPenalty = penalty;
                    bestHour = t;
                }
            }
            return bestHour;
        }
    }




}
