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
     PriorityQueue<Integer> pq ;
    public int kthSmallest(TreeNode root, int k) {
         pq= new PriorityQueue<Integer>( Collections.reverseOrder());
         dfs(root,k);
         return pq.poll();
         
    }
    public void dfs(TreeNode root, int k){
        if(root==null)return;
        dfs(root.left,k);
        if(pq.size()<k)
        pq.add(root.val);
        else return;
        dfs(root.right,k);
        
    }
}