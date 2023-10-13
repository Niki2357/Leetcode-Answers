# s_to_t = {'a':3, 'g':1}
# t_to_s = {'g':1, 'a':3}

# print(s_to_t == t_to_s)

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        n = len(s)
        s_to_t = {}
        t_to_s = {}
        # check length
        if len(s) != len(t):
            return False
        for i in range(n):
            if s[i] not in s_to_t:
                s_to_t[s[i]] = 1
            else:
                s_to_t[s[i]] += 1
        for i in range(n):
            if t[i] not in t_to_s:
                t_to_s[t[i]] = 1
            else:
                t_to_s[t[i]] += 1
        print(s_to_t)
        print(t_to_s)

        return s_to_t == t_to_s
        

solution = Solution()
s = 'rat'
t = 'car'
print(solution.isAnagram(s,t))