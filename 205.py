s = 'egs'
t = 'add'
structure_s = {}
structure_t = {}

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        for i in range(len(s)):
            print(s[i])
            if s[i] in structure_s and t[i] in structure_t:
                if structure_s[s[i]] != t[i] or structure_t[t[i]] != s[i]:
                    return False
            elif s[i] not in structure_s and t[i] not in structure_t:
                structure_s[s[i]] = t[i]
                structure_t[t[i]] = s[i]
            else:
                return False
        return True


solution = Solution()
print(solution.isIsomorphic(s,t))
