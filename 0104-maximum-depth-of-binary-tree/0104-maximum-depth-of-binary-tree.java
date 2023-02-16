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
    
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
   
    }
}

































//   // Base Condition
//         if(root == null) return 0;
//         // Hypothesis
//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);
//         // Induction
//         return Math.max(left, right) + 1;