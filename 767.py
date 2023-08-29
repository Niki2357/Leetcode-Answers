s = 'aaaabb'
index = 0

def find_dif_letter(s,index):
    print("__",index)
    i = index+1
    print(i)
    while i<= len(s):
        if s[i] != s[index]:
            print("got letter")
            return i
        else:
            
            i+=1
            print("move on", i)
            if i == len(s):
                break
    return 0
        
while index < len(s)-1 :
    print(s[index])
    if s[index] == s[index+1]:
        new_letter_index = find_dif_letter(s,index)
        if new_letter_index == 0:
            print("nope")
            break
        else:
            s = list(s)
            holder = s[index+1]
            s[index+1] = s[new_letter_index]
            s[new_letter_index]=holder


    index += 1


print(s)



# class Solution(object):
#     def reorganizeString(self, s):
#         index = 0

#         def find_dif_letter(s,index):
#             print("__",index)
#             i = index+1
#             print(i)
#             while i<= len(s):
#                 if s[i] != s[index]:
#                     print("got letter")
#                     return i
#                 else:
                    
#                     i+=1
#                     print("move on", i)
#                     if i == len(s):
#                         break
#             return 0
                
#         while index < len(s)-1 :
#             print(s[index])
#             if s[index] == s[index+1]:
#                 new_letter_index = find_dif_letter(s,index)
#                 if new_letter_index == 0:
#                     return("")
#                     break
#                 else:
#                     s = list(s)
#                     holder = s[index+1]
#                     s[index+1] = s[new_letter_index]
#                     s[new_letter_index]=holder
#                     s = ''.join(s)


#             index += 1


#         return(s)

