class Solution {
    char [][] b;

    public boolean isValidSudoku(char[][] board) {
        b = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               if(board[i][j]!='.') if (!checkValid(i, j))
                    return false;
            }
        }
        return true;

    }

    private boolean checkValid(int i, int j) {
        int val=Character.getNumericValue(b[i][j]);
        return checkRow(val, i, j) && checkColumn(val, i, j) && checkSubBoard(val, i, j);

    }

    private boolean checkRow(int val, int r, int c) {
        for (int i = 0; i < 9; i++) {
            if (Character.isLetterOrDigit(b[r][i])&&Character.getNumericValue(b[r][i]) == val && i != c)
                return false;
        }
        return true;
    }

    private boolean checkColumn(int val, int r, int c) {
        for (int i = 0; i < 9; i++) {
            if (Character.isLetterOrDigit(b[i][c])&&Character.getNumericValue(b[i][c]) == val && i != r)
                return false;
        }
        return true;

    }

    private boolean checkSubBoard(int val, int r, int c) {
        int i = findStart(r);
        int j = findStart(c);
        int endi = i + 3;
        int endj = j + 3;
        for (int out = i; out < endi; out++) {
            for (int inner = j; inner < endj; inner++) {
                if (Character.isLetterOrDigit(b[out][inner])&&Character.getNumericValue(b[out][inner]) == val && (out != r && inner != c))
                    return false;
            }
        }
        return true;

    }

    private int findStart(int v){
        if(v>=0 && v<3)return 0;
        if(v>=3 && v<6 ) return 3;
        if(v>=6) return 6;
        else return -1;
    }

}