class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int chhota=0;
        int braber=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                chhota++;
            }else if(nums[i]==target){
                braber++;
            }
        }
        for(int i=chhota;i<chhota+braber;i++){
            list.add(i);
        }
        return list;
        
    }
}