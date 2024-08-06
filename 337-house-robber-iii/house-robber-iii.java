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
    Map <TreeNode,Integer> mapfalse;
    Map <TreeNode,Integer> maptrue;
    public int rob(TreeNode root) {
        mapfalse=new HashMap<>();
        maptrue=new HashMap<>();

        return DFS(root,false);
        
    }
    private int DFS(TreeNode root, boolean flag){
        if(root==null)return 0;
        int res=0;
        if(flag && maptrue.containsKey(root)) {
            return maptrue.get(root);
        }
        if(!flag && mapfalse.containsKey(root)) {
            return mapfalse.get(root);
        }
        if(!flag){
            res= Math.max(root.val+DFS(root.right,true)+DFS(root.left,true),DFS(root.right,false)+DFS(root.left,false));
            mapfalse.put(root, res);
        }
         
         else{
            res= DFS(root.right,false)+DFS(root.left,false);
            maptrue.put(root, res);
         }
        
            return res;
         
    }
    
}