class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        for letter in s:
            if ord(letter) not in range(97,122):
                s = s.replace(letter,'')

        print(s)
        # print(s[0:int(len(s)/2)])
        first_half = s[:int((len(s))/2)]
        second_half = s[int(len(s)/2)::]
        second_half = second_half[::-1]
        print(first_half)
        print(second_half)
        if first_half == second_half[:len(first_half)]:
            return True
        else: return False

solution = Solution()
s = '0P'
answer = solution.isPalindrome(s)
print(answer)


# 这题不对劲 leetcode给的答案里，s='0P'的情况expected output是false，这个难道不应该是true嘛