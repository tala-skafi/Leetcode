class Solution {
    Set<Integer> set;
    int cols;

    public boolean exist(char[][] board, String word) {
        set = new HashSet<>();
        if (board.length == 0)
            return false;
        cols = board[0].length;
        // for loop to find the start letter
        // DFS this letter
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < cols; j++) {
                if (DFS(i, j, word, 0, board))
                    return true;
            }
        }
        return false;

    }

    private boolean DFS(int i, int j, String word, int track, char[][] board){
        if(track==word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= cols || word.charAt(track)!=board[i][j] || set.contains(i * cols + j)){
            return false;
        }
        set.add(i * cols + j);
        boolean exists= DFS(i, j+1, word, track+1 , board)
        || DFS(i, j-1, word, track+1 , board)
        || DFS(i-1, j, word, track+1 , board)
        || DFS(i +1, j, word, track+1 , board);
         set.remove(i * cols + j);
         return exists;
    }
}