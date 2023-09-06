class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        length = 0
        index = len(s)-1
        while index >= 0:
            if s[index] != ' ':
                length += 1
                if s[index-1] == ' ':
                    break
            index -= 1
        return(length)
    
solution = Solution()
s = "a"
length = solution.lengthOfLastWord(s)
print(length)
                

        
                
                



        