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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        root.val = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null) {
                    levelSum += curr.left.val;
                }
                if (curr.right != null) {
                    levelSum += curr.right.val;
                }
                q.add(curr);
            }
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                int siblingSum = 0;
                if (curr.left != null) {
                    siblingSum += curr.left.val;
                }
                if (curr.right != null) {
                    siblingSum += curr.right.val;
                }
                if (curr.left != null) {
                    curr.left.val = levelSum - siblingSum;
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    curr.right.val = levelSum - siblingSum;
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
}