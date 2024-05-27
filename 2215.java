import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> overlap = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                overlap.add(num);
            } else {
                set2.add(num);
            }
        }
        
        List<List<Integer>> out = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int num : set1) {
            if (!overlap.contains(num)) {
                list1.add(num);
            } 
        }
        for (int num : set2) {
            if (!overlap.contains(num)) {
                list2.add(num);
            } 
        }
        out.add(list1);
        out.add(list2);
        return out;
    }
}