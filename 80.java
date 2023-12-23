
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k = nums.length;
//         int len = nums.length;
//         int i = 0;
//         int j;
//         while (i < len) {
//             j = i + 2;
//             while (j < len) {
//                 if (nums[j] != nums[i]) {
//                     j -= 1;
//                     break;
//                 } else {
//                     nums[j] = 10001;
//                     k -= 1;
//                     j += 1;
//                 }
//             }
//             i = j;
//         }
//         Array.sort(nums); // cannot import?
//         return k;
//     }
// }

class Solution {

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3};
        System.out.println(removeDuplicates(array));
    }
    public static int removeDuplicates(int[] nums) {
        // Special case...
        if (nums.length <= 2)
            return nums.length;
        int prev = 1;       // point to previous
        int curr = 2;       // point to current
        // Traverse all elements through loop...
        while (curr < nums.length) {
            if (nums[curr] == nums[prev] && nums[curr] == nums[prev - 1]) {
                curr++;
            }
            // Otherwise, count that element and update...
            else {
                prev++;
                nums[prev] = nums[curr];
                curr++;
            }
        }
        return prev + 1;     // Return k after placing the final result in the first k slots of nums...
    }
}

