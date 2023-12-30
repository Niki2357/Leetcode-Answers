import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private void bfs(char[][] board, int row, int col) {
        int rows = board.length, cols = board[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        board[row][col] = 'N';

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            int r = current[0], c = current[1];
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

            for (int[] d : directions) {
                int newRow = r + d[0], newCol = c + d[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && board[newRow][newCol] == 'O') {
                    queue.add(new int[]{newRow, newCol});
                    board[newRow][newCol] = 'N';
                }
            }
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int rows = board.length;
        int cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if ((row == 0 || row == rows - 1 || col == 0 || col == cols - 1) && board[row][col] == 'O') {
                    bfs(board, row, col);
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                } else if (board[row][col] == 'N') {
                    board[row][col] = 'O';
                }
            }
        }
    }
}
