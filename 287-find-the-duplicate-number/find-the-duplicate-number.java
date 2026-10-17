class Solution {
    public int findDuplicate(int[] nums) {
          int initial = nums[0];
        int finl = nums[0];
        do {
            initial = nums[initial];
            finl = nums[nums[finl]];
        } 
        while (initial != finl);
        initial = nums[0];
        while (initial != finl) {
            initial = nums[initial];
            finl = nums[finl];
        }
        return initial;
        
    }
}