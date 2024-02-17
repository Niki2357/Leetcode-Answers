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
    public void flatten(TreeNode root) {
        helper(root);
    }
    private TreeNode helper(TreeNode root) {
        // base case
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        // only right
        if (root.left == null && root.right != null) {
            root.right = helper(root.right);
            return root;
        }
        // only left
        if (root.left != null && root.right == null) {
            root.right = helper(root.left);
            root.left = null;
            return root;
        }
        // both children
        if (root.left != null && root.right != null) {
            root.left = helper(root.left);
            root.right = helper(root.right);
            TreeNode leftRoot = root.left;
            while (leftRoot.right != null) {
                leftRoot = leftRoot.right;
            }
            leftRoot.right = root.right;
            root.right = root.left;
            root.left = null;
            return root;
        }
        return null;
    }
}