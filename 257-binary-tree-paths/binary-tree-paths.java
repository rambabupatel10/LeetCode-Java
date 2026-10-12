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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        solve(root,"",list);
        return list; 
    }
    void solve(TreeNode root,String path,List<String>list){
        if(root==null){
            return ;
        }
        path+=root.val;
        if(root.left==null && root.right==null){
            list.add(path);
            return ;
        }
        path+="->";
        solve(root.left,path,list);
        solve(root.right,path,list);
    }
}