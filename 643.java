class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double oriSum = 0;
        for (int i = 0; i < k; i++) {
            oriSum += nums[i];
        }
        double max = oriSum/k;
        int left = 0;
        int right = k;
        while (right < nums.length) {
            oriSum = oriSum - nums[left] + nums[right];
            // System.out.println(oriSum);
            if (oriSum/k > max) {
                max = oriSum/k;
            }
            left++;
            right++;
        }
        return max;
    }
}