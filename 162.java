class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        return findPeakElement(nums, left, right);
    }
    private int findPeakElement(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if (mid == 0 || mid == nums.length - 1) {
            return nums[0] > nums[nums.length - 1] ? 0 : nums.length - 1;
        }
        if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
            return mid;
        } else if (nums[mid - 1] > nums[mid]) {
            return findPeakElement(nums,left,mid);
        } else {
            return findPeakElement(nums, mid + 1, right);
        }
    }
}