class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;

        Map<Integer, Integer> map = new HashMap<>();
        return minCostClimbingStairs(cost, len, map);
        
    }
    private int minCostClimbingStairs(int[] cost, int curStep, Map<Integer, Integer> map) {

        if (curStep == 0 || curStep == 1) {
            return 0;
        } else {
            int first = curStep - 2;
            int second = curStep - 1;
            if (!map.containsKey(first)) {
                map.put(first, cost[first] + minCostClimbingStairs(cost, first, map));
            }
            if (!map.containsKey(second)) {
                map.put(second, cost[second] + minCostClimbingStairs(cost, second, map));
            }
            int first_cost = map.get(first);
            int second_cost = map.get(second);
            if (first_cost < second_cost) {
                return first_cost;
            } else {
                return second_cost;
            }
        }
    }
}