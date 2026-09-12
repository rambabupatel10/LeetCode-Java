class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    // List<Integer> curr=new ArrayList<>();
    public  void fintPermutation(int nums[],List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])){
                continue;
            }

            curr.add(nums[i]);
            fintPermutation(nums,curr);
            curr.remove(curr.size()-1);
        }


    }

    public List<List<Integer>> permute(int[] nums) {
        fintPermutation(nums,new ArrayList<>());
        return ans;
        
        
    }
}