class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
    int max=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    }
    int start=1;
    int end=max;
    while(start <= end){
        int  mid=start+(end-start)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i] + mid - 1) / mid;
        }
        if(sum<=threshold){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return start;
        
    }
}