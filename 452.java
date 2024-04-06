class Solution {
    public int findMinArrowShots(int[][] points) {
        mergeSort(points);
        // for (int[] arr : points) {
        //     System.out.println(Arrays.toString(arr));
        // }
        int arrows = 0;
        int balloon = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > points[balloon][1]) {
                arrows++;
                balloon = i;
            }
        }

        return arrows + 1;
    }

    private static void mergeSort(int[][] arr) {
        if (arr.length > 1) {
            int[][] left = new int[arr.length / 2][];
            int[][] right = new int[arr.length - left.length][];
            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[i + left.length];
            }
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    private static void merge(int[][] arr, int[][] left, int[][] right) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            if (r >= right.length
                || (l < left.length && left[l][1] <= right[r][1])) {
                arr[i] = left[l];
                l++;
            } else {
                arr[i] = right[r];
                r++;
            }
        }
    }
}