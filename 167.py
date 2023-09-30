from ast import List

# need an algorithm that only contains one loop

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        index1 = 0
        while (index1 < len(numbers)):
            index2 = index1 + 1
            if index1 == 0 or numbers[index1] != numbers[index1 - 1]:
                while (index2 < len(numbers)):
                    if numbers[index1] + numbers[index2] == target:
                        result = [index1 + 1, index2 + 1]
                        break
                    else:
                        index2 += 1
            index1 += 1
        return result


solution = Solution()
list = [2,7,11,15]
i = 9
result = solution.twoSum(list, i)
print(result)