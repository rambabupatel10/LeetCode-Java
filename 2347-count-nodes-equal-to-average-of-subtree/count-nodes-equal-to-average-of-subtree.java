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
    static class Info{
        int sum;
        int count;
         Info(int sum,int count){
            this.sum=sum;
            this.count=count;
         }
    }
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        calculate(root);
        return ans;
        
    }
    public  Info calculate(TreeNode  root){
        if(root==null){
            return new Info(0,0);
        }
        Info left=calculate(root.left);
        Info right=calculate(root.right);
        int sum=root.val+left.sum+right.sum;
        int count=1+left.count+right.count;
        int average=sum/count;
        if(root.val==average){
            ans++;
        }
        return new Info(sum,count);
    }
}