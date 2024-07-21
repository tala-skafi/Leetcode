class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        if(grid.length==0) return 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    DFS(grid , i , j);
                    count++;
                }
            }
        }
        return count;

        
    }
    public void DFS(char[][] grid, int row, int column){
        if (grid.length == 0|| row >= grid.length || row < 0 || column >= grid[0].length || column < 0 || grid[row][column]!='1' )
             return;
         
            grid[row][column] = '2';    
            DFS(grid, row, column - 1);//go up
            DFS(grid, row, column + 1);//go down
            DFS(grid, row - 1, column);//go left
            DFS(grid, row + 1, column);//go right

    }
}