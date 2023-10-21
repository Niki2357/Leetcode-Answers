import java.lang.reflect.Array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int len = nums.length;
        int i = 0;
        int j;
        while (i < len) {
            j = i + 2;
            while (j < len) {
                if (nums[j] != nums[i]) {
                    j -= 1;
                    break;
                } else {
                    nums[j] = 10001;
                    k -= 1;
                    j += 1;
                }
            }
            i = j;
        }
        Array.sort(nums); // cannot import?
        return k;
    }
}