class Solution {
     List <List<Integer>> ans = new ArrayList<>();

    public void findSubsets(int[] nums, List<Integer> curr, int i) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        //jaha prr hmm include krten hain ki add krna hai
          curr.add(nums[i]);
        findSubsets(nums, curr, i + 1);
        //yehi step backtracking ka hai 
        curr.remove(curr.size() - 1);
          while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        //the choice where we will do that how to preform the task
        //to do the choice next go and check it will come or not

        findSubsets(nums, curr, i + 1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);

        ans.clear();
        findSubsets(nums, new ArrayList<>(), 0);
        return ans;
        
    }
}