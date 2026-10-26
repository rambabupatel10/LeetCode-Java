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
    int ans = -1;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;

        find(root, root.val);
        return ans;
    }

    public void find(TreeNode root, int min) {
        if (root == null) return;
        if (root.val > min) {
            if (ans == -1 || root.val < ans) {
                ans = root.val;
            }
            return;
        }
        find(root.left, min);
        find(root.right, min);
    }
}