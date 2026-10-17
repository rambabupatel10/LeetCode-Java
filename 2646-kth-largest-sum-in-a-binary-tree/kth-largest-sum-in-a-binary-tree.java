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
    public long kthLargestLevelSum(TreeNode root, int k) {
         List<List<Integer>> ans = levelOrder(root);
         List<Long> finl=new ArrayList<>();
        for (int i = 0; i < ans.size(); i++) {
            long sum = 0;
            for (int j = 0; j < ans.get(i).size(); j++) {
                sum += ans.get(i).get(j);
            }
            finl.add(sum);
        }
        if (finl.size() < k) {
            return -1;
        }
        Collections.sort(finl, Collections.reverseOrder());
        return finl.get(k - 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
         if (root == null) {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> curr=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currNode=q.remove();
            if(currNode==null){
                ans.add(curr);
                curr = new ArrayList<>();
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