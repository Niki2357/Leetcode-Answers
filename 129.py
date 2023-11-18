# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helperSumNumbers(self, root: Optional[TreeNode], sum) -> int:
        print("sum is ", sum)
        if root == None:
            return 0
        print("root is", root.val)
        sum = sum * 10 + root.val
        if root.left == None and root.right == None:
            return sum
        return self.helperSumNumbers(root.left,sum) + self.helperSumNumbers(root.right,sum)
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        return self.helperSumNumbers(root,0)
        