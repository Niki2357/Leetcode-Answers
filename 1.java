import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int first_num = 0;
        int second_num;
        int length = nums.length;
        int[] output = new int[2];
        while (first_num < length - 1) {
            second_num = first_num + 1;
            while (second_num < length) {
                // System.out.printf("index: %d and %d \n", first_num, second_num);
                // System.out.printf("%d and %d \n", nums[first_num], nums[second_num]);
                if (nums[first_num] + nums[second_num] == target) {
                    output[0] = first_num;
                    output[1] = second_num;
                    // System.out.println(output[0]);
                    // System.out.println(output[1]);
                    return output;
                } else {
                    second_num++;
                }
                
            }
            first_num++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        Solution.twoSum(nums, target);
        System.out.printf("%d and %d \n", Solution.twoSum(nums, target)[0], Solution.twoSum(nums, target)[1]);

    }
}