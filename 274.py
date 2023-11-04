from typing import List


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort()
        print(citations)
        h = len(citations)
        while h>0:
            count = 0
            for citation in citations:
                if citation >= h:
                    count += 1
            if count >= h:
                return h
            h -= 1
        return 0

            
            


        
        
s = Solution()
citations = [1,3,1]
print(s.hIndex(citations))