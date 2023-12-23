class Solution {
    public int mySqrt(int x) {
        if (x < 1) {
            return 1;
        }
        int low = 0;
        int high = x/2;
        int mid;
        while (low<=high) {
            mid = (low+high)/2;
            if (mid*mid > x) {
                high = mid;
            } else {
                if ((mid + 1)*(mid + 1) > x) {
                    return mid;
                } else {
                    low = mid;
                }
            }
        }
        return 0;
    }
}