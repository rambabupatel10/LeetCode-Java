class Solution {
    public int maxAbsoluteSum(int[] nums) {
      int currMax=0;
      int currMin=0;

      int max=0;
      int minn=0;
        for(int i=0;i<nums.length;i++){
            currMax+=nums[i];
            max=Math.max(currMax,max);
           if(currMax<0){
            currMax=0;
           }
           currMin+=nums[i];
           minn=Math.min(currMin,minn);
           if(currMin>0){
            currMin=0;
           }
        }
        return Math.max(max,Math.abs(minn));
        
    }
}