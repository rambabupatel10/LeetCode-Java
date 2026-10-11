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
    int Index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         Index = postorder.length - 1;
          return build(inorder, postorder, 0, inorder.length - 1);
    }
     public TreeNode build(int[] inorder, int[] postorder,int left, int right){
        if(left>right){
            return null;
        }
        int rootVal = postorder[Index--];
        TreeNode root=new TreeNode(rootVal);
        int mid=left;
        while(inorder[mid] != rootVal){
            mid++;
        }
        root.right=build(inorder,postorder,mid+1,right);
        root.left=build(inorder,postorder,left,mid-1);
        return root;
     }
}