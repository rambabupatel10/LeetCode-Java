class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
         for (int i = 0; i < n; i++) {
            total += nums[i];
        }
        int target = total - x;
        if (target < 0)
            return -1;
        int left = 0, sum = 0, maxLen = -1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            for (; sum > target; left++)
                sum -= nums[left];
            if (sum == target)
                maxLen = Math.max(maxLen, right - left + 1);
        }
        if (maxLen == -1)
            return -1;
        return n - maxLen;
    }
}