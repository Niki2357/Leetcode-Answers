import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows;
        ArrayList<Integer> cols;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (!rows.contains(Integer.valueOf(i))) {
                        rows.add(Integer.valueOf(i));
                    }
                    if (!cols.contains(Integer.valueOf(i))) {
                        cols.add(Integer.valueOf(i));
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows.contains(Integer.valueOf(i)) || cols.contains(Integer.valueOf(j))) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}