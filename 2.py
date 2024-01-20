# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        if not l1 or not l2:
            return None
        head = ListNode()
        curr = head
        carry = 0
        while l1 != None or l2 != None or carry != 0:
            if l1 == None:
                num1 = 0
            else:
                num1 = l1.val
            if l2 == None:
                num2 = 0
            else:
                num2 = l2.val
            sum = num1 + num2 + carry
            carry = sum // 10
            curr.next = ListNode(sum % 10)
            if l1 != None:
                l1 = l1.next
            else:
                l1 = None
            if l2 != None:
                l2 = l2.next
            else:
                l2 = None
            curr = curr.next
        return head.next
            
            
