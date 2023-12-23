from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = 0
        col = 0
        # check row:
        for row in range(0,9):
            checkRow = {}
            for col in range(0,9):
                if board[row][col] != '.':
                    # print('here',board[row][col])
                    key = board[row][col]
                    print(checkRow)
                    if key in checkRow:
                        return False
                    else:
                        checkRow[key] = 1
        # check col:
        for col in range(0,9):
            checkCol = {}
            for row in range(0,9):
                if board[row][col] != '.':
                    # print('by col',board[row][col])
                    key = board[row][col]
                    if key in checkCol:
                        return False
                    else:
                        checkCol[key] = 1
        # check square:
        for row in range(0,9,3):
            print("row", row)
            for col in range(0,9,3):
                print("col", col)
                checkSqr = {}
                for i in range(0,3):
                    for j in range(0,3):
                        if board[row+i][col+j] != '.':
                            # print("by sqr", board[row+i][col+j])
                            key = board[row+i][col+j]
                            if key in checkSqr:
                                return False
                            else:
                                checkSqr[key] = 1

        return True

s = Solution()
board = [['.','.','.','.','5','.','.','1','.'],['.','4','.','3','.','.','.','.','.'],['.','.','.','.','.','3','.','.','1'],['8','.','.','.','.','.','.','2','.'],['.','.','2','.','7','.','.','.','.'],['.','1','5','.','.','.','.','.','.'],['.','.','.','.','.','2','.','.','.'],['.','2','.','9','.','.','.','.','.'],['.','.','4','.','.','.','.','.','.']]
for i in range (0,9):
    print(board[i])
print(s.isValidSudoku(board))