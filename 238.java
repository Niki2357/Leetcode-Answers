class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zeroCount++;
            }
        }
        // int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (zeroCount == 0) {
                    nums[i] = product / nums[i];
                } else {
                    nums[i] = 0;
                }
            } else {
                if (zeroCount > 1) {
                    nums[i] = 0;
                } else {
                    nums[i] = product;
                }
            }
        }
        return nums;
    }
}