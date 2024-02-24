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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        if (left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        left = left - 1;
        right = right - 1;
        ListNode front = dummy;
        int count = 0;
        while (count < left) {
            front = front.next;
            count++;
        }
        if (front == null) {
            System.out.println("null");
        } else {
            System.out.println(front.val);
        }
        
        // System.out.println(count);
        // ListNode back = front;
        // while (count <= right) {
        //     back = back.next;

        //     count++;
        // }
        // ListNode curr = head;
        // HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        // int index = 0;
        // while (curr != null) {
        //     map.put(index, curr);
        //     index++;
        //     curr = curr.next;
        // }
        // System.out.println(front.val);
        // System.out.println(back.val);
        // if (back == null) {
        //     System.out.println("null");
        // } else {
        //     System.out.println(back.val);
        // }
        ListNode first = front.next;
        ListNode second = first.next;
        for (int i = 0; i < right - left; i++) {
            first.next = second.next;
            second.next = front.next;
            front.next = second;
            second = first.next;
        }
        return dummy.next;
    }
}