class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int k=0;k<32;k++){
            int countOfZeros=0;
            int countOfOnes=0;
            for(int i=0;i<nums.length;i++){
                if((nums[i] & (1<<k))== 0){
                    countOfZeros++;
                }else{
                    countOfOnes++;
                }
            }
                if(countOfOnes % 3==1){
                    ans|=(1<<k);
                }
            }
            return ans;
    }
}