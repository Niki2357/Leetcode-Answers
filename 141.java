/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        ArrayList<ListNode> arr = new ArrayList<>();
        while (curr != null) {
            if (arr.contains(curr)) {
                return true;
            } else {
                arr.add(curr);
                curr = curr.next;
            }
        }
        return false;
    }
}