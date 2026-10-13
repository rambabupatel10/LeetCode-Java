class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left <= right){
            if(left==right){
                ans+=nums[left];
            }else{
                ans+=nums[right]-nums[left];
            }
            left++;
            right--;
        }
        return ans;
        
    }
}