# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        arr = []
        curr = head
        while curr != None:
            if curr in arr:
                return True
            else:
                arr.append(curr)
                curr = curr.next
        return False