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
    int flag=0;
     HashSet<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
       set=new HashSet<>();
        rec(root,k);
        if(flag==1)return true;
        return false;
    }
    public void rec(TreeNode root, int k){
        if(root==null)return;
        if(set.contains(root.val))flag=1;
        set.add(k-root.val);
        
        System.out.println(root.val);
        rec(root.left,k);
        rec(root.right,k);
    }
}