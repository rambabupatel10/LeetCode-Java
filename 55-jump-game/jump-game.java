class Solution {
    public boolean canJump(int[] nums) {
        int currmax=0;
        for(int i=0;i<nums.length-1;i++){
            if(currmax<i){
                return false;
            }
            currmax=Math.max(currmax,i+nums[i]);
        }
            if(currmax>=nums.length-1){
                return true;
            
        }
        return false;
        
    }
}