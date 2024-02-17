/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        // level order traversal
        Queue<Node> q = new LinkedList<>();
        List<Node> levelorderList = new ArrayList<>();
        List<Node> rightmostNodes = new ArrayList<>();
        rightmostNodes.add(root);
        q.add(root);
        Node temp;
        Node rightmostNode = new Node();
        while (!q.isEmpty()) {
            rightmostNode = null;
            temp = q.poll();
            levelorderList.add(temp);
            if (temp.left != null) {
                q.add(temp.left);
                rightmostNode = temp.left;
            }
            if (temp.right != null) {
                q.add(temp.right);
                rightmostNode = temp.right;
            }
            if (rightmostNode != null) {
                rightmostNodes.add(rightmostNode);
            }
        }
        for (Node node : levelorderList) {
            System.out.print(node.val + " ");
        }

        // connect all first
        for (int i = 0; i < levelorderList.size() - 1; i++) {
            levelorderList.get(i).next = levelorderList.get(i+1);
        }

        // disconnect the rightmost of each level
        root.next = null;
        Node curr = root;
        while (curr.left != null || curr.right != null) {
            if (curr.right != null) {
                curr.right.next = null;
                if (curr.left != null && curr.right.left == null && curr.right.right == null) {
                    curr = curr.left;
                } else {
                    curr = curr.right;
                }
            } else if (curr.left != null) {
                curr.left.next = null;
                curr = curr.left;
            }
        }
        // for (Node rightmost : rightmostNodes) {
        //     rightmost.next = null;
        // }
        return root;
    }

}