# from typing import Optional

# # Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# class Solution:
#     def maxDepth(self, root: Optional[TreeNode]) -> int:
#         def dfs(root, depth):
#             if not root: return depth
#             return max(dfs(root.left, depth + 1), dfs(root.right, depth + 1))
                       
#         return dfs(root, 0)
    


# s = Solution()
# root = TreeNode()
# print(s.maxDepth(root))


from typing import Optional
from collections import deque

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    # My solution.
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        #Base case:
        if root == None:
            return 0
        else:
            left_depth = self.maxDepth(root.left)
            right_depth = self.maxDepth(root.right)
            return 1 + max(left_depth, right_depth)

    # GPT generated createTree helper function.
    def createTree(self, array: list) -> Optional[TreeNode]:
        if not array:
            return None
        
        root = TreeNode(array[0])
        queue = deque([root])
        i = 1
        
        while queue and i < len(array):
            current = queue.popleft()
            if array[i] is not None:
                current.left = TreeNode(array[i])
                queue.append(current.left)
            i += 1
            
            if i < len(array) and array[i] is not None:
                current.right = TreeNode(array[i])
                queue.append(current.right)
            i += 1
            
        return root

# Create a tree from the list
tree_array = [3,9,20,None,None,15,7]
s = Solution()
root = s.createTree(tree_array)
print(s.maxDepth(root))  # This should print the depth of the tree which is 3 in this case.
