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
        Queue <int[]> q =new LinkedList<>();
        Queue <int[]> p =new LinkedList<>();
        Queue <int[]> level =new LinkedList<>(); 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) p.add(new int[]{i,j});
            }
        }
        while(!p.isEmpty()){
           int [] front= p.poll();
           int x=front[0];
           int y=front[1];
           for(int[] d:dir){
            int xx=x+d[0];
            int yy=y+d[1];

            if(xx<grid.length && xx>=0 && yy>=0 && yy<grid[0].length && grid[xx][yy]==1){
                grid[xx][yy]=2;
                q.add(new int[]{xx,yy});
            }
            
           }
           if(p.isEmpty()){
            levelCount++;
            p=q;
            q=new LinkedList<>();
           }
           
        }
         for(int[] row : grid) {
            for(int cell : row) {
                if(cell == 1) {
                    return -1;  // Return -1 if any fresh orange is left
                }
            }
        }
        

        return levelCount==0 ? 0:levelCount-1;
    }
}