class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] matrix = new int[text1.length()][text2.length()];
        for (int row = 0; row < text1.length(); row++) {
            for (int col = 0; col < text2.length(); col++) {
                if (text1.charAt(row) == text2.charAt(col)) {
                    matrix[row][col] = 1 + matrix[row - 1][col - 1];
                } else {
                    matrix[row][col] = Math.max(matrix[row - 1][col], matrix[row][col - 1]);
                }
            }
        }
        String out = "";
        curRow = text1.length();
        curCol = text2.length();
        while (curRow > 0 && curCol > 0) {
            if (matrix[curRow - 1][curCol] == matrix[curRow][curCol - 1] && matrix[curRow][curCol] != matrix[curRow - 1][curCol - 1]) {
                out = text1.charAt(curRow) + out;
                curRow--;
                curCol--;
            } else {
                if (matrix[curRow - 1][curCol] > matrix[curRow][curCol - 1]) {
                    curCol--;
                } else {
                    curRow--;
                }
            }
        }
        return out;
    }
}