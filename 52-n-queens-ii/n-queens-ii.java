class Solution {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //digonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //vertical right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public int  nQueens(char board[][], int row) {

        if (row == board.length) {
           return 1;
            }
           int count=0;
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
               count += nQueens(board, row + 1);
                board[row][col] = '.';
            }
        }
        return count;
    }

     public int totalNQueens(int n) {
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

       return nQueens(board, 0);

    }
}
