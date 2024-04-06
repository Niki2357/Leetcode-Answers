import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;

        List<Integer> numsList1 = new ArrayList<>();
        for (int num : nums1) {
            numsList1.add(num);
        }
        List<Integer> numsList2 = new ArrayList<>();
        for (int num : nums2) {
            numsList2.add(num);
        }
        PriorityQueue<Integer> q1 = new PriorityQueue<>(numsList1);
        PriorityQueue<Integer> q2 = new PriorityQueue<>(numsList2);

        int i = q1.poll();
        int j = q2.poll();
        int sum = 0;

        List<List<Integer>> out = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        while (count < k) {
            sum = i + j;
            if (q2.peek() != null && sum > i + q2.peek()) {
                temp = new ArrayList<>();
                temp.add(i);
                temp.add(q2.peek());
                out.add(temp);
                count++;
                j = q2.poll();
            } else if (q1.peek() != null && sum > q1.peek() + j){
                temp = new ArrayList<>();
                temp.add(q1.peek());
                temp.add(j);
                out.add(temp);
                count++;
                i = q1.poll();
            } else {
            // if (count >= k) {
            //         break;
            // }
            temp = new ArrayList<>();
            temp.add(i);
            temp.add(j);
            if (i < j && q2.peek() != null) {
                j = q2.poll();
            } else if (q1.peek() != null) {
                i = q1.poll();
            }
            // System.out.println(temp.get(0) + " " + temp.get(1));
            out.add(temp);
            // temp.clear();
            count++;
            }
        }
        return out;
    }
}