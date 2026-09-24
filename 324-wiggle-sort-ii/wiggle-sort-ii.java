class Solution {
    public void wiggleSort(int[] nums) {
         int n=nums.length;
        int ans[]=new int [n];
        Arrays.sort(nums);
        int small=(n-1)/2;
        int big=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=nums[small--];
            }
            else{
                ans[i]=nums[big--];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        } 
    }
}