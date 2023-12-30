from typing import List
import collections

# 忘记考虑有些课程不需要prerequisite也能上，不是所有课都要串在一起上


class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        if not prerequisites:
            return True 
        dict = collections.defaultdict(int)
        for eachClass, eachPrereq in prerequisites:
            dict[eachClass] = eachPrereq
        print(dict)
        visited = []
        def bfs(start):
            numTaken = 1
            print(start)
            queue = []
            queue.append(start)
            visited.append(start[0])
            while queue:
                thisClass, thisPrereq = queue.pop(0)
                print("this prereq = ", thisPrereq)
                if thisPrereq not in dict:
                    numTaken += 1
                    print("num taken: ", numTaken)
                    return numTaken
                elif dict[thisPrereq] in visited:
                    return False
                else:
                    queue.append([thisPrereq,dict[thisPrereq]])
                    numTaken += 1
                    visited.append([thisClass])
            return numTaken

        maxClasses = 0
        for i in range(len(prerequisites)):
            numTaken = bfs(prerequisites[i])
            if numTaken > maxClasses:
                maxClasses = numTaken
            print(maxClasses)
        return  maxClasses == numCourses
    
s = Solution()
numCourses = 5
prerequisites = [[1,4],[2,4],[3,1],[3,2]]
print("result = ", s.canFinish(numCourses,prerequisites))