strs = ['dog','flow','floight']
strs = sorted(strs, key=len)
print(strs)

prefix = strs[0]
length_prefix = len(strs[0])
if_prefix = -1

while length_prefix > 0:
    print(prefix[:length_prefix])
    if if_prefix == 0:
        print(length_prefix)
        break
    if_prefix = 0
    for i in range(1,len(strs)):
        print('testing', strs[i])
        if strs[i].find(prefix[:length_prefix],0,len(strs[i])) != 0:
            length_prefix -= 1
            if_prefix = -1
            print('not found in ', strs[i])
            break
print(length_prefix)

# class version:
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs = sorted(strs, key=len)
        # print(strs)

        prefix = strs[0]
        length_prefix = len(strs[0])
        if_prefix = -1

        while length_prefix > 0:
            # print(prefix[:length_prefix])
            # print('hi')
            if if_prefix == 0:
                # print(length_prefix)
                break
            if_prefix = 0
            for i in range(1,len(strs)):
                # print('testing', strs[i])
                if strs[i].find(prefix[:length_prefix],0,len(strs[i])) != 0:
                    length_prefix -= 1
                    if_prefix = -1
                    # print('not found in ', strs[i])
                    break
        return(prefix[:length_prefix])
            
    



