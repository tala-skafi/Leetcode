class Solution {
    int [][] dir;
    public int orangesRotting(int[][] grid) {
        dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        if (grid.length == 0)
            return -1;
        return BFS(grid);

    }

    private int BFS(int[][] grid){
        int levelCount=0;
        int fresh=0;
        int countFresh=0;
        Queue <int[]> q =new LinkedList<>();
        Queue <int[]> p =new LinkedList<>();
        Queue <int[]> level =new LinkedList<>(); 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) p.add(new int[]{i,j});
                else if(grid[i][j]==1)fresh++;
            }
        }
        while(!p.isEmpty()){
           int [] front= p.poll();
           int x=front[0];
           int y=front[1];
           for(int[] d:dir){
            int newX=x+d[0];
            int newY=y+d[1];

            if(newX<grid.length && newX>=0 && newY>=0 && newY<grid[0].length && grid[newX][newY]==1){
                countFresh++;
                grid[newX][newY]=2;
                q.add(new int[]{newX,newY});
            }
            
           }
           if(p.isEmpty()){
            if(!q.isEmpty()){
                levelCount++;
                p=q;
                q=new LinkedList<>();
            }
            
           }
           
        }
        if(countFresh!=fresh) return -1;
        return levelCount;
    }
}