class Solution {
    public int minMoves(int[] nums) {
      int largest=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<nums.length;i++){
        largest=Math.max(largest,nums[i]);
        sum+=nums[i];
      }
      return (nums.length*largest)-sum;
    }
}