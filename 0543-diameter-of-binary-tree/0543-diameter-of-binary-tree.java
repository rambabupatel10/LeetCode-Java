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
    public class Info {
        int dim;
        int ht;

        Info(int dim, int ht) {
            this.dim = dim;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Info ans = solve(root);
        return ans.dim;
    }

    public Info solve(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = solve(root.left);
        Info rightInfo = solve(root.right);
        int dim = Math.max(Math.max(leftInfo.dim, rightInfo.dim), leftInfo.ht + rightInfo.ht);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(dim, ht);

    }
}