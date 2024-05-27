class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int cur = 0;
        for (int alt : gain) {
            cur += alt;
            if (cur > highest) {
                highest = cur;
            }
        }
        return highest;
    }
}