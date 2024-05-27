class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] matrix = new int[text1.length() + 1][text2.length() + 1];
        for (int row = 1; row <= text1.length(); row++) {
            for (int col = 1; col <= text2.length(); col++) {
                if (text1.charAt(row-1) == text2.charAt(col-1)) {
                    matrix[row][col] = 1 + matrix[row - 1][col - 1];
                } else {
                    matrix[row][col] = Math.max(matrix[row - 1][col], matrix[row][col - 1]);
                }
            }
        }
        return matrix[text1.length()][text2.length()];
    }
}