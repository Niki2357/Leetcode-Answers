class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            int[][] outArr = new int[1][];
            outArr[0] = newInterval;
            return outArr;
        }
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        int i = 0;
        ArrayList<int[]> out = new ArrayList<>();
        // put the precedent intervals into out
        while (i < intervals.length && intervals[i][1] < newStart) {
            out.add(intervals[i]);
            i++;
        }
        // find the next interval
        int j = i;
        // System.out.println(i);
        while (i < intervals.length && intervals[i][0] <= newEnd) {
            newStart = Math.min(newStart, intervals[i][0]);
            newEnd = Math.max(newEnd, intervals[i][1]);
            i++;
        }
        // Add the merged interval
        out.add(new int[]{newStart, newEnd});


        while (i < intervals.length) {
            out.add(intervals[i]);
            i++;
        }

        // System.out.println("-----------");
        // for (int[] arr : out) {
        //     System.out.println(arr[0] + " " + arr[1]);
        // }
        int[][] outArr = new int[out.size()][];
        for (int k = 0; k < out.size(); k++) {
            outArr[k] = out.get(k);
        }
        return outArr;
    }
}
