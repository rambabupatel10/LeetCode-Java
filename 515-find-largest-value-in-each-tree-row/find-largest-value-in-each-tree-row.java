
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> ans = levelOrder(root);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ans.size(); i++) {
            result.add(largest(ans.get(i)));
        }
        return result;
    }
    public int largest(List<Integer> list) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > large) {
                large = list.get(i);
            }
        }
        return large;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        List<Integer> curr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();

            if (currNode == null) {
                ans.add(curr);
                curr = new ArrayList<>();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                curr.add(currNode.val);
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        return ans;
    }
}
