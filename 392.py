class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        index = 0
        for letter in s:
            print(t[index+1:])
            if letter in t[index:]:
                index = t.index(letter,index, )+1
            else:
                return (False)
        return (True)
    
solution = Solution()
# s = 'abc'
# t = 'ahbgdc'

s = 'aaaaa'
t = 'bbaaa'
result = solution.isSubsequence(s,t)
print(result)