class Solution {
    public boolean canJump(int[] nums) {
        int index = nums.length - 1;
        int index2 = index;
        while (index2 >= 0){
            if (nums[index2] + index2 >= index){
                index = index2;
            }
            index2--;
        }
        return((index == 0) ? true:false);
    }
}