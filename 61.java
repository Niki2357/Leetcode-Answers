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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        } else {
            int count = 0;
            ListNode curr = head;
            while (curr != null) {
                curr = curr.next;
                count += 1;
            }
            k = k % count;
            ListNode newTail;
            ListNode oldTail;
            for (int i = 0; i < k; i++) {
                newTail = head;
                while (newTail.next.next != null) {
                    newTail = newTail.next;
                }
                oldTail = newTail.next;
                oldTail.next = head;
                newTail.next = null;
                head = oldTail;
            }
            return head;
        }
    }
}