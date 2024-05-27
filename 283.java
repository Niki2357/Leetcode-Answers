class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int change = 0;
        int check = 0;
        int temp;
        while (check < len) {
            if (nums[check] != 0) {
                nums[change] = nums[check];
                change++;
            }
            check++;
        }
        while (change < len) {
            nums[change] = 0;
            change++;
        }
    }
}