class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_depth = maxDepth(root.left);
            int right_depth = maxDepth(root.right);
            return 1 + Math.max(left_depth, right_depth);
        }
        
    }
}