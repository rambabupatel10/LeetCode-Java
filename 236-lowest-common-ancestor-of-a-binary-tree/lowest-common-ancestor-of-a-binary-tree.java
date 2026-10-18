/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean path(TreeNode root, TreeNode n,ArrayList<TreeNode> list){
        if(root==null){
            return false;
        }
        list.add(root);
        if(root==n){
            return true;
        }
        boolean getLeft=path(root.left,n,list);
        boolean getRight=path(root.right,n,list);
        if(getLeft || getRight){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();
        path(root,p,path1);
        path(root,q,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
        
    }
}