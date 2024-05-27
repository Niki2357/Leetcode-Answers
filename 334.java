class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = 0;
        int j;
        int k;
        int nextMin = Integer.MAX_VALUE;
        boolean marked = false;
        while (i < nums.length - 2) {
            marked = false;
            j = i + 1;
            if (nums[j] < nums[i]) {
                nextMin = j;
                marked = true;
            }
            while(j < nums.length - 1) {
                if (nums[i] < nums[j]) {
                    k = j + 1;
                    while (k < nums.length) {
                        if (nums[j] < nums[k]) {
                            return true;
                        }
                    }
                }
            }
            if (marked) {
                i = nextMin;
            } else {
                return false;
            }
        }
        return false;
    }
}