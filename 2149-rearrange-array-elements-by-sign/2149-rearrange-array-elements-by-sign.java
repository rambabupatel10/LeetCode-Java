class Solution {
    public int[] rearrangeArray(int[] nums) {
        int answer[]=new int [nums.length];
        int negative =1;
        int positive=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                answer[positive]=nums[i];
                positive+=2;
            }else{
                answer[negative]=nums[i];
                negative+=2;

            }
        }
        return answer;
    }
}