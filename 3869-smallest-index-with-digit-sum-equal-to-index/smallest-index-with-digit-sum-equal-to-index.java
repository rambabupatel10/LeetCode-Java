class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int digitSum=0;
            while(n>0){
                digitSum+=n%10;
                n/=10;
            }
            if(digitSum==i){
                return i;
            }
        }
        return -1;

        
    }
}