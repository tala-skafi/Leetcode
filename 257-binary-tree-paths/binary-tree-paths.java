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
    List <String> list;
    public List<String> binaryTreePaths(TreeNode root) {
       list=new ArrayList<>();
       if(root==null)return list;
        preOder(root,"");
        return list;
    }
    void preOder(TreeNode root,String str){
       if(root==null)return ;
        if(root.left==null && root.right==null)list.add(str+root.val);
        preOder(root.left,str+root.val+"->");
         preOder(root.right,str+root.val+"->");
    }
}