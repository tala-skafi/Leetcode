class Solution {
    public  int[] findRedundantConnection(int[][] edges) {
         int[] parent = new int[edges.length+1];
        for (int i = 1; i <=edges.length; i++) parent[i] = i;
        int components = edges.length;
        for (int[] e : edges) {
            int p1 = findParent(parent, e[0]);
            int p2 = findParent(parent, e[1]);
            if (p1 == p2) {
                return e;
            }
            else{
                parent[p2] = p1; 
            }
        }
        return new int[]{0,0};
       
    }
   
    private int findParent(int[] parent, int i) {
        if (i == parent[i]) return i;
        return parent[i] = findParent(parent, parent[i]); // Path compression
    }
}