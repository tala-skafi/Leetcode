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
    public List<Integer> rightSideView(TreeNode root) {
     Queue <TreeNode> q=new LinkedList<TreeNode>();
     Queue <TreeNode> p=new LinkedList<TreeNode>();
     Queue<TreeNode> temp;
        TreeNode front;
        p.add(root);
     List<Integer> result=new LinkedList<Integer>();
     List<Integer> level=new LinkedList<Integer>();
        if (root==null)return result;
        while (!p.isEmpty()){
            //1.pop front
            front=p.poll();
            //2.node
            if(level.isEmpty()){
                result.add(front.val);
                level.add(front.val);         
                               }
            //3.check nighbors
            if(front.right!=null)q.add(front.right);
            if(front.left!=null)q.add(front.left);
            
            //4.level over
            if(p.isEmpty()){
               level=new LinkedList<Integer>();
               temp = p;
               p = q;
               q = temp;
            }
        }
       return result; 
    }
}