class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        // row
        for(int i=0; i<m; i++){
            HashSet<Character> row = new HashSet<>();
            for(int j=0; j<n; j++){
                if(board[i][j] == '.') continue;
                if(row.contains(board[i][j])) return false;
                row.add(board[i][j]);
            }
        }
        //col
         for(int i=0; i<n; i++){
            HashSet<Character> col = new HashSet<>();
            for(int j=0; j<m; j++){
                if(board[j][i] == '.') continue;
                if(col.contains(board[j][i])) return false;
                col.add(board[j][i]);
            }
        }
        // Boxes part
        for(int boxrow = 0; boxrow < 3; boxrow++){
            for(int boxcol = 0; boxcol < 3; boxcol++){
            HashSet<Character> box = new HashSet<>();
                for(int i = boxrow*3; i < boxrow*3 +3; i++){
                    for(int j = boxcol*3; j < boxcol*3 +3; j++){
                        if(board[i][j] == '.') continue;
                        if(box.contains(board[i][j])) return false;
                        box.add(board[i][j]);
                    }
                }

            }
        }
        return true;
    }
}