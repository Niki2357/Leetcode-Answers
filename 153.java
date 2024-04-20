class Solution {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    private int findMin(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = (left + right) / 2;
        if (nums[left] < nums[right]) {
            return nums[left];
        } else {
            if ((mid == 0 || nums[mid] < nums[mid - 1]) && nums[mid] < nums[mid + 1]) {

                return nums[mid];
            }
            if (nums[mid] > nums[right]) {
                return findMin(nums, mid + 1, right);
            } else {
                return findMin(nums, left, mid - 1);
            }
        }
    }
}