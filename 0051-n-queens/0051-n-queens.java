

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Start backtracking from the first row
        placeQueens(0, board, solutions);
        return solutions;
    }

    private void placeQueens(int row, char[][] board, List<List<String>> solutions) {
        // If all queens are placed, add the board to the solutions
        if (row == board.length) {
            solutions.add(convertBoardToStringList(board));
            return;
        }

        // Try placing the queen in each column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';  // Place the queen
                placeQueens(row + 1, board, solutions); // Move to the next row
                board[row][col] = '.';  // Backtrack by removing the queen
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board) {

        // Check column for another queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check the diagonal from top-left to bottom-right (/)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check the diagonal from top-right to bottom-left (\)
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private List<String> convertBoardToStringList(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row)); // Convert each row of the board to a string
        }
        return result;
    }
}
