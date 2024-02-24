/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // hashmap <inputNode, outputNode>
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node output = new Node(head.val);
        Node inCurr = head;
        Node outCurr = output;
        while (inCurr != null) {
            if (inCurr.next == null) {
                outCurr.next = null;
            } else {
                outCurr.next = new Node(inCurr.next.val);
            }
            map.put(inCurr, outCurr);
            inCurr = inCurr.next;
            outCurr = outCurr.next;
        }

        inCurr = head;
        outCurr = output;
        while (inCurr != null) {
            if (inCurr.random == null) {
                outCurr.random = null;
            } else {
                outCurr.random = map.get(inCurr.random);
            }
            inCurr = inCurr.next;
            outCurr = outCurr.next;
        }
        return output;
    }
}