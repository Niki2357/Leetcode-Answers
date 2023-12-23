
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public int[][] merge(int[][] intervals) {
    // lambda
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    ArrayList<int[]> output = new ArrayList<>();

    int i = 0;
    while (i < intervals.length) {
        int start = intervals[i][0];
        int end = intervals[i][1];

        while (i < intervals.length - 1 && intervals[i + 1][0] <= end) {
            end = Math.max(end, intervals[i + 1][1]);
            i++;
        }
        output.add(new int[]{start, end});
        i++;
    }
    return output.toArray(new int[output.size()][]);
    }

}