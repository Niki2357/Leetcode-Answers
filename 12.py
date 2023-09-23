class Solution:
    def intToRoman(self, num: int) -> str:
        M = int(num/1000)
        num %= 1000
        D = int(num/500)
        num %= 500
        C = int(num/100)
        num %= 100
        L = int(num/50)
        num %= 50
        X = int(num/10)
        num %= 10
        V = int(num/5)
        num %= 5
        I = num
        print(M," ",D," ",C," ",L," ",X," ",V," ",I)
        output = "M" * M
        if D == 1 and C == 4:
            output += "CM"
        elif D == 0 and C == 4:
            output += "CD"
        else:
            output += "D" * D + "C" * C
        if L == 1 and X == 4:
            output += "XC"
        elif L == 0 and X == 4:
            output += "XL"
        else:
            output += "L" * L + "X" * X
        if V == 1 and I == 4:
            output += "IX"
        elif V == 0 and I == 4:
            output += "IV"
        else:
            output += "V" * V + "I" * I
        print(output)
        return "hello"

solution = Solution()
num = 58
solution.intToRoman(num)
        