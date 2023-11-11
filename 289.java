public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] tempBoard = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tempBoard[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                for (int[] dir : directions) {
                    int row = i + dir[0];
                    int col = j + dir[1];
                    if (row >= 0 && row < m && col >= 0 && col < n && tempBoard[row][col] == 1) {
                        liveNeighbors++;
                    }
                }
                if (tempBoard[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 0;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
