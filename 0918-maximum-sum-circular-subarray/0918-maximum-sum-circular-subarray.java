class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax=0;
        int max=Integer.MIN_VALUE;

        int currMin=0;
        int min=Integer.MAX_VALUE;

        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];

            currMax+=nums[i];
            max=Math.max(currMax,max);
            if(currMax < 0 ){
                currMax=0;
            }
            currMin+=nums[i];
             min=Math.min(currMin,min);
            if(currMin > 0 ){
                currMin=0;
            }
        }
        if(max<0){
            return max;
        }
        return Math.max(max,(total-min));
    }
}