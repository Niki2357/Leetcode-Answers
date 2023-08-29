import numpy as np

columnNumber = 701
#alphabet = np.array(["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"])

answer = ''
while (columnNumber != 0):
    residue =  int(columnNumber%26)
    print(residue)
    if residue == 0:
        #answer += alphabet[25]
        answer += chr(90)
        columnNumber -= 26
    else:
        #answer += alphabet[residue-1]
        answer += chr(64 + residue)
        columnNumber -= residue
    columnNumber /= 26

print(answer)

answer = answer[::-1]
print(answer)
