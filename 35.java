class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid = 0;
        if (target > nums[length - 1]) {
            return length;
        }
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}