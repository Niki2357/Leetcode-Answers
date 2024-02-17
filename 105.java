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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < preorder.length; i++) {
            hash.put(inorder[i], i);
        }
        // find the index of the right child in preorder. if cannot find, it's set to preorder.length
        int indexRightChild = preorder.length;
        for (int i = 1; i < preorder.length; i++) {
            if (hash.get(preorder[i]) > hash.get(preorder[0])) {
                indexRightChild = i;
                break;
            }
        }
        root.left = buildTree(0, Arrays.copyOfRange(preorder, 1, indexRightChild), hash);
        root.right = buildTree(0, Arrays.copyOfRange(preorder, indexRightChild, preorder.length), hash);
        return root;
    }

    private TreeNode buildTree(int index, int[] preorder, HashMap<Integer, Integer> hash) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 2) {
            if (hash.get(preorder[0]) < hash.get(preorder[1])) {
                root.right = new TreeNode(preorder[1]);
            } else {
                root.left = new TreeNode(preorder[1]);
            }
            return root;
        }
        if (preorder.length == 3) {
            if (hash.get(preorder[1]) < hash.get(preorder[0]) && hash.get(preorder[0]) < hash.get(preorder[2])) {
                root.left = new TreeNode(preorder[1]);
                root.right = new TreeNode(preorder[2]);
                return root;
            } else if (hash.get(preorder[2]) < hash.get(preorder[0]) && hash.get(preorder[0]) < hash.get(preorder[1])) {
                root.right = new TreeNode(preorder[1]);
                root.left = new TreeNode(preorder[2]);
                return root;
            }  
        }
        // find the index of the right child
        int indexRightChild = preorder.length;
        for (int i = 1; i < preorder.length; i++) {
            if (hash.get(preorder[i]) > hash.get(preorder[0])) {
                indexRightChild = i;
                break;
            }
        }
        root.left = buildTree(0, Arrays.copyOfRange(preorder, 1, indexRightChild), hash);
        root.right = buildTree(0, Arrays.copyOfRange(preorder, indexRightChild, preorder.length), hash);
        return root;
    }

}