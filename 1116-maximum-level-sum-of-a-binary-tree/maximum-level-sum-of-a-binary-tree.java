/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        int maxLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();

            if (currNode == null) {
                if (sum > maxSum) {
                    maxSum = sum;
                    maxLevel = level;
                }
                sum = 0;
                level++;

                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                sum += currNode.val;

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        return maxLevel;
    }
}