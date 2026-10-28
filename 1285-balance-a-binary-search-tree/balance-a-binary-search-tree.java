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
    List<Integer> list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        preorder(root);
        return buildTree(0,list.size()-1);
        
    }
    public void preorder(TreeNode root){
        if (root==null){
            return;
        }
        preorder(root.left);
        list.add(root.val);
        preorder(root.right);
    }
    public TreeNode buildTree(int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(list.get(mid));
      root.left=buildTree(left,mid-1);
       root.right=buildTree(mid+1,right);
        return root;
    }
}