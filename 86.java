/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode low = new ListNode(-1);
        ListNode out = low;
        ListNode high = new ListNode(-1);
        ListNode curr = head;
        ListNode highCurr = high;

        while (curr != null) {
            if (curr.val < x) {
                low.next = curr;
                curr = curr.next;
                low = low.next;
                low.next = null;
            } else {
                highCurr.next = curr;
                curr = curr.next;
                highCurr = highCurr.next;
                highCurr.next = null;
            }
        }
        low.next = high.next;
        return out.next;
    }
}