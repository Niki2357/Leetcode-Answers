class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rowTop = 0;
        int rowBot = m - 1;
        int rowMid = 0;
        while (rowTop <= rowBot) {
            rowMid = (rowTop + rowBot) / 2;
            if (matrix[rowMid][0] > target) {
                rowBot = rowMid - 1;
            } else if (matrix[rowMid][n - 1] < target) {
                rowTop = rowMid + 1;
            } else {
                break;
            }
        }
        int left = 0;
        int right = n - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (matrix[rowMid][mid] == target) {
                return true;
            } else if (matrix[rowMid][mid] < target) {
                left = mid + 1;
            } else if (matrix[rowMid][mid] > target) {
                right = mid - 1;
            }
        }
        return false;
    }
}