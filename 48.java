class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}