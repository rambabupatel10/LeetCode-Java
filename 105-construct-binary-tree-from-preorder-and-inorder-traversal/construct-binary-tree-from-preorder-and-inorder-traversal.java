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
    int Index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);   
    }
    public TreeNode build(int preorder[],int inorder[],int left, int right){
        if(left>right){
            return null;
        }
        int rootVal=preorder[Index++];
        TreeNode root=new TreeNode(rootVal);
        int mid=left;
        while(inorder[mid] != rootVal){
            mid++;
        }
        root.left=build(preorder,inorder,left,mid-1);
        root.right=build(preorder,inorder,mid+1,right);
        return root;
    }
}