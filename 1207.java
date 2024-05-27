import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            if (set.contains(map.get(key))) {
                return false;
            } else {
                set.add(map.get(key));
            }
        }
        return true;
    }
}  