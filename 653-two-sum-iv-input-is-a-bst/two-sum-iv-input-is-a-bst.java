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
    public boolean findTarget(TreeNode root, int k) {
        return calculation(root, root, k);
    }
    public boolean calculation(TreeNode node, TreeNode root, int k) {
        if (node == null) return false;
        int target = k - node.val;
        if (target != node.val && binarySearch(root, target)) {
            return true;
        }
        return calculation(node.left, root, k) || calculation(node.right, root, k);
    }
    public boolean binarySearch(TreeNode root, int target) {
        while (root != null) {
            if (root.val == target) return true;
            if (target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }
}