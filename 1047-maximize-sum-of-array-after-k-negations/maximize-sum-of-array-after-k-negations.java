class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int i=0;
        while(i<nums.length && k>0){
            if(nums[i]<0){
                nums[i]=Math.abs(nums[i]);
                k--;
            }
            i++;
        }
        if(k%2==1){
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
        
    }
}