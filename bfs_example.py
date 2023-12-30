img = [[1,0,1,1,0],[0,1,0,1,0],[1,1,1,1,1],[0,0,1,0,1],[1,0,0,0,0]]
# initial position: 
row, col = 2,2
# new fill:
p = 3
def floodFill(img, row, col, p):
    start = 1
    queue = [(row, col)]
    visited = set()

    while len(queue) > 0:
        row, col = queue.pop(0)
        visited.add((row,col))
        img[row][col] = p
        for row, col in neighbors(img, row, col, start):
            if (row, col) not in visited:
                queue.append((row, col))
    return img

def neighbors(img, row, col, start):
    # list of indices of the four directions: up, down, left, and right (as tuples)
    indices = [(row - 1,col),(row + 1, col), (row, col - 1), (row, col + 1)]
    # list of indices of the neighbors (as tuples)
    # a valid index needs to be: 1. not out of bound; 2. not visited (value remains unchanged)
    output = [(row, col) for row, col in indices if isValid(img, row, col) and img[row][col] == start]
    print(output)
    return output

def isValid(img, row, col):
    return row >= 0 and col >= 0 and row < len(img) and col < len(img[0])

print(floodFill(img, row, col, p))
