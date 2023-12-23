from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        output = []
        length = len(intervals)
        # sorting intervals with the the first number using lambda expression
        intervals.sort(key = lambda x: x[0])
        print(intervals)
        print(output)
        i = 0
        while i < length:
            start = intervals[i][0]
            end = intervals[i][1]
            while i < length - 1 and intervals[i + 1][0] <= end:
                i += 1
                end = max(end, intervals[i][1])
            output.append([start,end])
            print(output)
            i += 1
        return output

s = Solution()
intervals = [[2, 6],[1, 3], [8, 10], [15, 18]]
s.merge(intervals)