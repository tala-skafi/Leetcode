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
    int count=1;
    int result=0;
    public int kthSmallest(TreeNode root, int k) {
         //pq= new PriorityQueue<Integer>(Collections.reverseOrder());
         dfs(root,k);
         return result;
         
    }
    public void dfs(TreeNode root, int k){
        if(root==null)return;
        dfs(root.left,k);
        if(count==k)
        result=root.val;
        else if(count>k) return;
        count++;
        dfs(root.right,k);
        
    }
}