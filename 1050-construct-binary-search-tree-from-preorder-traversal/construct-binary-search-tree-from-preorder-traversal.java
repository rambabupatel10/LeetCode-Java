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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=construct(root,preorder[i]);
        }
        return root;
        
    }
    public static TreeNode construct(TreeNode root, int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(root.val>val){
            root.left=construct(root.left,val);
        }else{
            root.right=construct(root.right,val);
        }
        return root;
    }
}