from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        str = []
        for i in range(len(strs)):
            temp = ''.join(sorted(strs[i]))
            if temp not in map:
                map[temp] = []
            if temp in map:
                map[temp].append(strs[i])
        print(map)
        for difKey in map:
            str.append(map[difKey])
        return str
        
s = Solution()
strs = ['eat', 'tea', 'ate', 'eta', 'bta', 'she']

print(s.groupAnagrams(strs))