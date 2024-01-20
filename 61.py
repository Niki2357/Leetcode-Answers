# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head

        # to reduce the number of rotation:

        count = 0
        curr = head
        while curr != None:
            curr = curr.next
            count += 1
        k = k%count

        for i in range(k):
            newTail = head
            while newTail.next.next != None:
                # print(newTail.val)
                newTail = newTail.next
            oldTail = newTail.next
            oldTail.next = head
            newTail.next = None
            # print(newTail)
            # print(oldTail)
            head = oldTail
        return head
        