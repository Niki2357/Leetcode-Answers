class Solution(object):
    def merge(self, nums1, m, nums2, n):

       
        index1 = 0
        index2 = 0

        total_length = len(nums1)

        if nums1 == [0]:
            return(nums1)

        else:

            while index1 < total_length-1 and index2 < n:
            #print("Hi")
                if nums1[index1] < nums2[index2] and (nums1[index1+1] > nums2[index2] or nums1[index1+1] == nums2[index2]):
                    print(nums1[index1], "is smaller than", nums2[index2])
                    nums1.insert(index1+2, nums2[index2])
                    nums1 = nums1[:-1]
                    index1 += 2
                    index2 += 1
                elif nums1[index1] < nums2[index2] and nums1[index1+1] < nums2[index2] and nums1[index1+1] != 0:
                    print("move on")
                    index1 += 1
                elif nums1[index1] < nums2[index2] and nums1[index1+1] < nums2[index2] and nums1[index1+1] == 0:
                    print("end")
                    nums1.insert(index1+1, nums2[index2])
                    nums1 = nums1[:-1]
                    index1 += 1
                    index2 += 1
                elif nums1[index1] == nums2[index2]:
                    print(nums1[index1], "is equal to", nums2[index2])
                    nums1.insert(index1+1, nums2[index2])
                    nums1 = nums1[:-1]
                    index1 += 1
                    index2 += 1
                elif nums1[index1] > nums2[index2]:
                    print(nums1[index1], "is bigger than", nums2[index2])
                    index2 += 1
            return(nums1)

# solution = Solution()        
# nums1 = [1,2,3,0,0,0]
# nums2 = [2,5,6]
# m = 3
# n = 3
# answer = solution.merge(nums1, m, nums2, n)
# print(answer)

