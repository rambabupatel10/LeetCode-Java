class Solution {
     List<List<Integer>> ans = new ArrayList<>();

    public void findSubsets(int[] nums, List<Integer> curr, int i) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
          curr.add(nums[i]);
        findSubsets(nums, curr, i + 1);
        curr.remove(curr.size() - 1);

        findSubsets(nums, curr, i + 1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums, new ArrayList<>(), 0);
        return ans;
        
    }
}