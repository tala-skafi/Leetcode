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
    int max=0;
    public int maxDepth(TreeNode root) {
        
        return calculate(root,1);
        
    }
    public int calculate(TreeNode root, int count){
        if(root==null) return 0;
        max=Math.max(count,max);
        calculate(root.left,count+1);
        calculate(root.right,count+1);
        return max;

    }
}