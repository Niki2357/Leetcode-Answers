/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new Queue<>();
        List<Double> out = new ArrayList<>();
        q.add(root);
        int level = 0;
        BSTNode<T> temp;
        while (!q.isEmpty()) {
            temp = q.poll();
            out.add(temp.val);
            level++;
            if (temp.left) {
                q.add(temp.left);
            }
            if (temp.right) {
                q.add(temp.right);
            }
        }
    }

    
    // public List<Double> averageOfLevels(TreeNode root) {
    //     List<Double> out = new ArrayList<>();
    //     out.add((double) root.val);
    //     averageOfLevels(root, out);
    //     double[] outArr = new double[out.size()];
    //     for (int k = 0; k < out.size(); k++) {
    //         outArr[k] = out.get(k);
    //     }
    //     return out;

    // }

    // private void averageOfLevels(TreeNode root, List out) {
    //     if (root.left == null && root.right == null) {
    //         return;
    //     } else if (root.left == null) {
    //         out.add((double) root.right.val);
    //         averageOfLevels(root.right, out);
    //         return;
    //     } else if (root.right == null) {
    //         out.add((double) root.left.val);
    //         averageOfLevels(root.left, out);
    //         return;
    //     } else {
    //         out.add((root.left.val + root.right.val) / 2.0);
    //         averageOfLevels(root.left, out);
    //         averageOfLevels(root.right, out);
    //         return;
    //     }
    // }
}