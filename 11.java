class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            if ((right - left) * Math.min(height[right], height[left]) > max) {
                max = (right-left) * Math.min(height[right], height[left]);
            }
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}