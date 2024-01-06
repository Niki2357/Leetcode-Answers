class Solution {
    public int climbStairs(int n) {
        int sum = 0;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int firstStair = 1;
            int secondStair = 2;
            
            for (int i = 2; i < n; i++) {
                sum = firstStair + secondStair;
                firstStair = secondStair;
                secondStair = sum;
            
            }
        }
        return sum;
    }
}