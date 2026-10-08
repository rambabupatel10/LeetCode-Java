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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
         if (root == null) {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
         boolean even = false;
        while(!q.isEmpty()){
            TreeNode currNode=q.remove();
            if(currNode==null){
                  if (even) {
                    Collections.reverse(curr);
                }
                ans.add(curr);
                curr = new ArrayList<>();
                 even = !even;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                curr.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
        return ans;
        
    }
}