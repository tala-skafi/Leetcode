class Solution {
    List<List<String>> res;
    int N;
    
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        N = n;
        int[] queens = new int[n];  // Array to store the position of queens in each row
        Arrays.fill(queens, -1);
        DFS(0, queens, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return res;
    }

    private void DFS(int row, int[] queens, Set<Integer> cols, Set<Integer> diags1, Set<Integer> diags2) {
        if (row == N) {
            res.add(generateBoard(queens));
            return;
        }

        for (int col = 0; col < N; col++) {
            int diag1 = row - col;
            int diag2 = row + col;

            if (cols.contains(col) || diags1.contains(diag1) || diags2.contains(diag2)) {
                continue;
            }

            queens[row] = col;
            cols.add(col);
            diags1.add(diag1);
            diags2.add(diag2);

            DFS(row + 1, queens, cols, diags1, diags2);

            queens[row] = -1;
            cols.remove(col);
            diags1.remove(diag1);
            diags2.remove(diag2);
        }
    }

    private List<String> generateBoard(int[] queens) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            char[] row = new char[N];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
