class Solution {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int left = 0;
        int right = 0;
        int max = 0;
        int cur = 0;
        int remaining = k;
        while (right < nums.length) {
            if (nums[right] == 1) {
                cur++;
                right++;
            } else {
                if (remaining > 0) {
                    remaining--;
                    cur++;
                    right++;
                } else {
                    if (nums[left] == 0) {
                        cur--;
                        left++;
                        remaining++;
                    } else {
                        cur--;
                        left++;
                    }
                    
                }
            }
            if (cur > max) {
                max = cur;
            }
        }
        return max - 1;
    }
}