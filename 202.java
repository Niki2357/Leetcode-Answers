import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        HashSet visited = new HashSet<>();
        int digitSum = n;
        int temp;
        while (true) {
            
            visited.add(digitSum);
            temp = 0;
            
            while (digitSum > 0) {
                temp += Math.pow(digitSum % 10, 2);
                digitSum /= 10;
            }

            if (temp == 1) {
                return true;
            } else if (visited.contains(temp)) {
                return false;
            }
            digitSum = temp;
        }
    }
}