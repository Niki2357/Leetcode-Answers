class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_list = s.split()
        map = {}
        i = 0
        # check if the length of the two strings are different:
        # immediately return False if different.
        if len(s_list) != len(pattern):
            return False
        # use set() to create a list of unique elements:
        # immediately return False if there are dif numbers of unique elements in two strings.
        if len(set(pattern)) != len(set(s_list)):
            print(set(pattern),set(s_list))
            return False
        while i < len(s_list):
            # print(s_list[i])
            if pattern[i] not in map:
                map[pattern[i]] = s_list[i]
            else:
                print(s_list[i] + ' is in the map')
                if s_list[i] != map[pattern[i]]:
                    return False
            i += 1
        print(map)
        return True
        
    
solution = Solution()
pattern = 'abba'
s = 'dog cat cat dog'

print(solution.wordPattern(pattern,s))

