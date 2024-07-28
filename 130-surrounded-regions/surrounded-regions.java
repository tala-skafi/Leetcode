class Solution {
    boolean[][] globalVisit;
    boolean[][] localVisit;
    boolean isSurr = true;

    public void solve(char[][] board) {
        globalVisit = new boolean[board.length][board[0].length];
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length - 1; j++) {
                isSurr = true;
                localVisit = new boolean[board.length][board[0].length];
                if (board[i][j] == 'X')
                    continue;
                if (!globalVisit[i][j]) {
                    DFS(i, j, board, localVisit);
                    if (isSurr)
                        fillBoard(board, localVisit);
                }

            }
        }

    }

    private void fillBoard(char[][] board, boolean[][] localVisit) {
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (localVisit[i][j])
                    board[i][j] = 'X';
            }
        }

    }

    private void DFS(int i, int j, char[][] b, boolean[][] v) {
        if ((i == 0 || j == 0 || i >= b.length - 1 || j >= b[0].length - 1) && b[i][j] == 'O') {
            isSurr = false;
            return;
        }

        if (v[i][j] || b[i][j] == 'X')
            return;
        v[i][j] = true;
        globalVisit[i][j] = true;
        DFS(i + 1, j, b, v);
        DFS(i - 1, j, b, v);
        DFS(i, j + 1, b, v);
        DFS(i, j - 1, b, v);
    }
}