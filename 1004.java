class Solution {
    public int longestOnes(int[] nums, int k) {
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
            // System.out.println(left + " " + right + " " + cur);
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}