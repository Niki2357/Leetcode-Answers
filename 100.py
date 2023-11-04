# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        # Base case:
        if p == None and q == None:
            return True
        elif (p == None and q != None) or (p != None and q == None):
            return False
        elif (self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)):
            return p.val == q.val