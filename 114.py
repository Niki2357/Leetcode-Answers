# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        # only run if itself is null:
        if root != None:
            print("value ", root.val)
            # base case | both left and right:
            if root.left != None and root.right != None:
                print("case 1")
                root.left.right = root.right
                root.right = root.left
                root.left = None
            elif root.left != None or root.right != None:
                # print("2")
                # base case | only left:
                if root.left != None:
                    print("case 2.1")
                    root.right = root.left
                    root.left = None

                # base case | only right:
                # we are done.
                if root.right != None:
                    # self.flatten(root.right)
                    print("case 2.2")
                
            self.flatten(root.left)
            self.flatten(root.right)
            
            