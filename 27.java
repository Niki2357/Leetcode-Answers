import java.io.*;
import java.util.Arrays;
class Solution {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int k = 0;
        while (i < nums.length) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return(k);
    }
}

class Main{
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = Solution.removeElement(nums, val);
        System.out.println(k);
    }

}