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

        possibleCombination(candidates, i,target - candidates[i], ans, combination);
        ans.remove(ans.size() - 1);
        possibleCombination(candidates, i + 1,target, ans, combination);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> combination = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        possibleCombination(candidates, 0, target, ans, combination);

        return combination;
    }
}