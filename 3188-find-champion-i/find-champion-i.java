class Solution {
    public int findChampion(int[][] grid) {
     int max=0;
     int counter=0;
     int winner=0;
     int len=grid.length;
     for(int i=0;i<len;i++){
        counter=0;
        for(int j=0;j<len;j++){
            if(j==i)continue;
            if(grid[i][j]==1)counter++;

        }
        if(counter>max){
            max=counter;
            winner=i;
        }
     }
     return winner;
    }
}