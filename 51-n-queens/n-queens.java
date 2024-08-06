class Solution {
    List<List<String>> res;
    int N;
    
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        N = n;
        DFS(n, new int[n], new ArrayList<>(), new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return res;
    }

    private void DFS(int n, int[] info, List<String> temp, boolean[] cols, boolean[] d1, boolean[] d2) {
        if (n == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        int row = N - n;
        char[] rowArray = new char[N];
        Arrays.fill(rowArray, '.');

        for (int i = 0; i < N; i++) {
            if (!cols[i] && !d1[row - i + N] && !d2[row + i]) {
                rowArray[i] = 'Q';
                temp.add(new String(rowArray));
                cols[i] = true;
                d1[row - i + N] = true;
                d2[row + i] = true;

                DFS(n - 1, info, temp, cols, d1, d2);

                // Backtrack
                temp.remove(temp.size() - 1);
                cols[i] = false;
                d1[row - i + N] = false;
                d2[row + i] = false;
                rowArray[i] = '.';
            }
        }
    }
}
