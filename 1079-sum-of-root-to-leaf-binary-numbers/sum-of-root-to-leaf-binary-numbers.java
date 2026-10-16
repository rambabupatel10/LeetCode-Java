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
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> list=new ArrayList<>();
        findPaths(root,"",list);
        int sum=0;
    for(int i=0;i<list.size();i++){
       sum+=binaryToDec(list.get(i));   
    }
    return sum;
    }
     public void findPaths(TreeNode root, String path,
                          ArrayList<String> list) {
        if (root == null) {
            return;
        }

        path += root.val;

        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }

        findPaths(root.left, path, list);
        findPaths(root.right, path, list);
    }
    public static int binaryToDec(String s){
          int decimal = 0;
        for (int i = 0; i < s.length(); i++) {
            decimal = decimal * 2 + (s.charAt(i) - '0');
        }
        return decimal;
    }
}