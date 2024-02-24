class Solution {
    public static int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int[] out = new int[2];
                out[0] = i;
                out[1] = map.get(nums[i]);
                return out;
            }
            map.put(target - nums[i],i);
        }
        return null;


        // int first_num = 0;
        // int second_num;
        // int length = nums.length;
        // int[] output = new int[2];
        // while (first_num < length - 1) {
        //     second_num = first_num + 1;
        //     while (second_num < length) {
        //         if (nums[first_num] + nums[second_num] == target) {
        //             output[0] = first_num;
        //             output[1] = second_num;
        //             return output;
        //         } else {
        //             second_num++;
        //         }
                
        //     }
        //     first_num++;
        // }
        // return output;
    }
}