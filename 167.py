from ast import List

# need an algorithm that only contains one loop

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        result = [0,0]
        index1 = 0
        length = len(numbers)
        while index1 < length - 1:
            index2 = index1 + 1
            if index1 == 0 or numbers[index1] != numbers[index1 - 1]:
                while index2 < length:
                    if numbers[index1] + numbers[index2] == target:
                        result[0] = index1 + 1
                        result[1] = index2 + 1
                        return result
                    elif numbers[index1] + numbers[index2] > target:
                        break
                    index2 += 1
            index1 += 1
        return result


solution = Solution()
list = [2,7,11,15]
i = 9
result = solution.twoSum(list, i)
print(result)