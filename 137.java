class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
                list.add(num);
            } else {
                map.replace(num, map.get(num) + 1);
            }
        }
        for (int num : list) {
            if (map.get(num) != 3) {
                return num;
            }
        }
        return -1;
    }
}