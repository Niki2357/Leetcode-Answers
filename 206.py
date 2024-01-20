# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        
        newList = None
        curr = head
        while curr:
            next = curr.next
            curr.next = newList
            newList = curr
            curr = next
        return newList
 
            
        