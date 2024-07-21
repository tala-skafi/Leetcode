public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      Queue <TreeNode> p=new LinkedList<>();
      Queue <TreeNode> q=new LinkedList<>();
      Queue <TreeNode> level=new LinkedList<>();
      List <Integer> ans=new ArrayList<>();  
      p.add(root);
      if (root==null)return ans;
      while(!p.isEmpty()){
        //front
        TreeNode front= p.poll();
        //children
        if(front.right!=null)q.add(front.right);
        if(front.left!=null)q.add(front.left);
        //node
        level.add(front);

        //check p empty (level over)
        if(p.isEmpty()){
            ans.add(level.poll().val);
            p=q;
            q=new LinkedList<>();
            level=new LinkedList<>();
        }
      }
        return ans;
    }
    
    
  
}