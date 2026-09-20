class Solution {
public void possibleCombination(int[] candidates, int i, int target,  List<Integer> ans, List<List<Integer>> combination) {
        if (target == 0) {
            combination.add(new ArrayList<>(ans));
            return;
        }
        if (i == candidates.length || target < 0) {
            return;
        }
        ans.add(candidates[i]);
        possibleCombination(candidates,i+1,target - candidates[i], ans, combination);
        ans.remove(ans.size() - 1);
           int next = i + 1;

        while (next < candidates.length &&
               candidates[next] == candidates[i]) {
            next++;
        }
         possibleCombination(candidates,next,target,ans,combination);
    }
    
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
        List<List<Integer>> combination = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        possibleCombination(candidates, 0, target, ans, combination);
        return combination;
    }
}
