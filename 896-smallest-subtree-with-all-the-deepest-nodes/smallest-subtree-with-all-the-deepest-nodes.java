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
    class deep{
        int height;
        TreeNode node;
        deep(int h,TreeNode n){
            height = h;
            node = n;
        }
    }
    private deep dfs(TreeNode node){
        if(node == null) return new deep(0,null);
        deep left = dfs(node.left);
        deep right = dfs(node.right);

        if(left.height > right.height){
            return new deep(left.height+1,left.node);
        }
        else if(right.height > left.height){
            return new deep(right.height+1,right.node);
        }
        else{
            return new deep(left.height+1,node);
        }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }
}