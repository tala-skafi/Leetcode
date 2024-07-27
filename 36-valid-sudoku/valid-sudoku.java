class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set <Integer> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
            int val=Character.getNumericValue(board[i][j]);
            if(set.contains(val))return false;
            set.add(val);
            }
            set.clear();
            
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')continue;
            int val=Character.getNumericValue(board[j][i]);
            if(set.contains(val))return false;
            set.add(val);
            }
            set.clear();
            
                }
    set.clear();


        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int newI=3*(i/3);
                int newJ=3*(i%3);
                char c=board[newI+j/3][newJ+j%3];
                if(c=='.')continue;
                System.out.print(c);
                int val=Character.getNumericValue(c);
                if(set.contains(val))return false;
                set.add(val);
            }
            System.out.println("______________");
            set.clear();
        } 
       return true;
        
        
    }
}