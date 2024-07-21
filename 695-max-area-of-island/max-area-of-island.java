class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        if(grid.length==0) return 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    DFS(grid , i , j);
                    max=Math.max(max,count);
                    count=0;
                }
            }
        }
        return max;

        
    }
      public void DFS(int[][] grid, int row, int column){
        if (grid.length == 0|| row >= grid.length || row < 0 || column >= grid[0].length || column < 0 || grid[row][column]!=1 )
             return;
         count+=1;
            grid[row][column] = 2;    
            DFS(grid, row, column - 1);//go up
            DFS(grid, row, column + 1);//go down
            DFS(grid, row - 1, column);//go left
            DFS(grid, row + 1, column);//go right

    }
}