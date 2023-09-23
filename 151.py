class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        firstPointer = len(s)-1
        lastPointer = len(s)-1
        
        output = ''
        while (firstPointer >= 0):
    

            if s[firstPointer] != ' ' and (s[firstPointer-1] == ' ' or firstPointer == 0):
                output += s[firstPointer:lastPointer+1] + ' '
                firstPointer -= 2
                lastPointer = firstPointer
            elif  s[firstPointer] == ' ':
                firstPointer -= 1
                lastPointer -= 1
            else:
                firstPointer -= 1

        output = output.strip() 
        return output
    
solution = Solution()
s = '   hello world   asdf '
solution.reverseWords(s)
