class Solution {
    boolean PO=false, AO=false;
     List<List<Integer>> res;
    public List<List<Integer>> pacificAtlantic(int[][] h) {
        res=new ArrayList<>();
        for(int i=0;i<h.length;i++){
            for(int j=0;j<h[0].length;j++){
                PO = false;
                AO = false;
                
                DFS(i,j,h[i][j],h,new boolean[h.length][h[0].length]);
                if(PO&&AO){
                    res.add(Arrays.asList(i,j));
                 }
            }
        }

        return res;
    }
    public void DFS(int i, int j, int last, int[][]h,boolean[][]v){
        if(i<0 || j<0){
            PO=true;
            return;
        }
        if(i>=h.length || j>= h[0].length){
            AO=true;
            return;
        }
        if(h[i][j] > last || v[i][j]){
            return;
        }
        v[i][j]=true;
        DFS(i+1,j,h[i][j],h,v);
        DFS(i-1,j,h[i][j],h,v);
        DFS(i,j+1,h[i][j],h,v);
        DFS(i,j-1,h[i][j],h,v);
        
        
        

    }
}