import java.util.HashMap;
import java.util.Map;

class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            if (!map.containsKey(n-1)) {
                map.put(n-1, tribonacci(n-1));
            }
            if (!map.containsKey(n-2)) {
                map.put(n-2, tribonacci(n-2));
            }
            if (!map.containsKey(n-3)) {
                map.put(n-3, tribonacci(n-3));
            }
            return map.get(n-1) + map.get(n-2) + map.get(n-3);
        }
    }
}