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
    int min = Integer.MAX_VALUE;
    int prev = -1;
    public int minDiffInBST(TreeNode root) {
        minDist(root);
        return min;
    }
    public void minDist(TreeNode root) {
        if (root == null) {
            return;
        }
        minDist(root.left);
        if (prev != -1) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        minDist(root.right);
    }
}