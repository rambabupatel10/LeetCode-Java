class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
         //int[] vornelqixa = nums;
        int left = 0;
        long ans = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] < minK || nums[right] > maxK) {
                left = right + 1;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}