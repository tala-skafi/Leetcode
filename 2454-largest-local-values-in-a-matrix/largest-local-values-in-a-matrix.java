class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len=grid.length;
        int [][]res=new int [len-2][len-2];
        for(int i=0;i<len;i++){
           for ( int j=0;j<len;j++){
                if(i+3<=len && j+3<=len){
                    res[i][j]=findMax(grid, i , j);
                }
            }
        }
        return res;
    }
    public int findMax(int [][]grid, int i,int j){
        int max=0;
        for(int row=i;row<i+3;row++){
            for(int col=j;col<j+3;col++){
                max=Math.max(max,grid[row][col]);

            }
        }
        return max;
    }
}