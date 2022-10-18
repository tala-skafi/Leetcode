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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        recurse(root);
        return ans;
    }
    
    public int recurse(TreeNode root) {
		//base case
        if(root == null) return 0;
		//postorder
        int left = recurse(root.left); 
        int right = recurse(root.right);
        
		//anything that is negative will never help maximize the path , so lets ignore it
        if(left < 0) left = 0;
        if(right < 0) right = 0;
		
		//worst case - root is only considered , if left and right are negatives
        int sum = root.val + left + right;
		//update global answer
        ans = Math.max(sum, ans);
		//from here send to parent what is max (it will be either curr+leftMax or curr+rightMax , as path in one directional)
        return Math.max(left + root.val, right + root.val);
    }
}