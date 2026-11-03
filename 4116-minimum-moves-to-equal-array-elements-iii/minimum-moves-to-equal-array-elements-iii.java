class Solution {
    public int minMoves(int[] nums) {
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
      }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=largest-nums[i];
        }
        return count;
        
    }
}