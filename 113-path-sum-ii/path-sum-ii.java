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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        path(root,targetSum,0,curr,ans);
            return ans;
    }
     void path(TreeNode root,int targetSum,int sum,List<Integer>curr,List<List<Integer>>ans){
        if(root==null){
            return ;
        }
        curr.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(curr));
            }
        }
        path(root.left,targetSum,sum,curr,ans);
         path(root.right,targetSum,sum,curr,ans);
         curr.remove(curr.size()-1);

    }
}