class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
       for letter in ransomNote:
           if letter not in magazine:
               return False
           else:
               magazine = magazine.replace(letter,"",1)
       return True 
    

    # With real hashmap
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        dict = {}
        for letter in magazine:
            if letter not in dict:
                dict[letter] = 1
            else:
                dict[letter] += 1
        print(dict)

        for letter in ransomNote:
            if letter in dict and dict[letter] > 0:
                dict[letter] -= 1
            else:
                return False
        return True


solution = Solution()
ransomNote = 'aa'
magazine = 'aab'
result = solution.canConstruct(ransomNote, magazine)
print(result)
