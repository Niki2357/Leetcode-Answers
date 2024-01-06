import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(nums[0]);
            output.add(singleElementList);
            return output;
        }
        
        if (nums.length == 2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            list1.add(nums[0]);
            list1.add(nums[1]);
            list2.add(nums[1]);
            list2.add(nums[0]);
            output.add(list1);
            output.add(list2);
            return output;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int[] remaining = new int[nums.length - 1];
            for (int j = 0, k = 0; j < nums.length; j++) {
                if (i != j) {
                    remaining[k++] = nums[j];
                }
            }
            List<List<Integer>> sublists = permute(remaining);
            for (List<Integer> sublist : sublists) {
                List<Integer> combinedList = new ArrayList<>();
                combinedList.add(nums[i]);
                combinedList.addAll(sublist);
                output.add(combinedList);
            }
        }
        return output;
    }
}
