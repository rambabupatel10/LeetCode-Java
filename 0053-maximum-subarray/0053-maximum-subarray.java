class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maximumSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            maximumSum=Math.max(currSum , maximumSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maximumSum;
    }
}