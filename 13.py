# super slow. learn hash map
class Solution:
    def romanToInt(self, s: str) -> int:
        result = 0
        i = 0
        while i < len(s):
            print(i, s[i])
            if s[i] == "M":
                print("+1000")
                result += 1000
                i += 1
            elif s[i] == "D":
                result += 500
                i += 1
            elif s[i] == "C":
                if i == len(s)-1:
                    result += 100
                    i += 1
                    break
                elif s[i+1] == "M":
                    print("+900")
                    result += 900
                    print("before", i)
                    i += 2
                    print("after", i)
                elif s[i+1] == "D":
                    result += 400
                    i += 2
                else:
                    result += 100
                    i += 1
            elif s[i] == "L":
                result += 50
                i += 1
            elif s[i] == "X":
                if i == len(s)-1:
                    result += 10
                    i += 1
                    break
                elif s[i+1] == "L":
                    result += 40
                    i += 2
                elif s[i+1] == "C":
                    result += 90
                    i += 2
                else:
                    result += 10
                    i += 1
            elif s[i] == "V":
                result += 5
                i += 1
            elif s[i] == "I":
                print(i, len(s))
                if i == len(s)-1:
                    result += 1
                    i += 1
                    break
                elif s[i+1] == "V":
                    result += 4
                    print(result)
                    i += 2
                    print(i)
                    break
                elif s[i+1] == "X":
                    result += 9
                    i += 2
                    break
                else:
                    result += 1
                    i += 1
                    
        return result

solution = Solution()
s = 'MCDLXXVI'
result = solution.romanToInt(s)
print(result)


