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
    public static int solve(TreeNode root,int max){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.val>=max){
            count=1;
            max=root.val;
        }
        count+=solve(root.left,max);
        count+=solve(root.right,max);
        return count;
    }
    public int goodNodes(TreeNode root) {
        return solve(root,root.val);
        
    }
}