class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < weights.length; i++) {
            end += weights[i];
            if (start < weights[i]) {
                start = weights[i];
            }
        }
        while (start <= end) {
            int capacity = start + (end - start)/2;
            int day = 1;
            int sum = 0;
            for (int i = 0; i < weights.length; i++) {
                if (sum + weights[i] > capacity) {
                    day++;
                    sum = weights[i];
                } else {
                    sum += weights[i];
                }
            }
                if (day <= days) {
                    end = capacity - 1;
                } else {
                    start = capacity + 1;
                }
        }
        return start;
    }
}