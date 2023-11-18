# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def HelperIsSymmetric(self, leftRoot: Optional[TreeNode], rightRoot: Optional[TreeNode]) -> bool:
        if leftRoot == None and rightRoot == None:
            return True
        if leftRoot == None or rightRoot == None:
            return False
        return leftRoot.val == rightRoot.val and self.HelperIsSymmetric(leftRoot.left, rightRoot.right) and self.HelperIsSymmetric(leftRoot.right, rightRoot.left)

    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if root == None:
            return True
        if root.left == None and root.right != None:
            return False
        if root.left != None and root.right == None:
            return False
        if root.left == None and root.right == None:
            return True
        return root.left.val == root.right.val and self.HelperIsSymmetric(root.left, root.right)