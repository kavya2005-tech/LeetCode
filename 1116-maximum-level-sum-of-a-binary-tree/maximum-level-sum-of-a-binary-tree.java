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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = Integer.MIN_VALUE;
        int maxl = 1;
        int currl = 1;
        while(!q.isEmpty()){
            int lsize = q.size();
            int lsum = 0;
            for(int i=0;i<lsize;i++){
                TreeNode node = q.poll();
                lsum += node.val;

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            if(lsum > sum){
                sum = lsum;
                maxl = currl;
            }
            currl++;
        }
        return maxl;
    }
}