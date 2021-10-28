"""
Problem Statement: Imagine the field is a 2D plane. Each cell is either water 'W' or a tree 'T'. 
A forest is a collection of connected trees. Two trees are connected if they share a side i.e. if they are adjacent to each other.

Your task is, given the information about the field, print the size of the largest forest

Size of a forest is the number of trees in it. 

If there are no forests in the field print -1.

Input format:

First line contains the size of the matrix N

The next N lines contain N characters each, either 'W' or 'T' separated by space

Read the inputs from the standard input stream

Constraints:

1<=N<=350

Output format:

Print the size of the biggest forest to the standard output stream.

Test Cases:

Sample Input	Sample Output	Explanation
--------------------------------------------------------
5            |  10           | The forest on the top   |
T T T W W    |               | left has 6 trees but    |
T W W T T    |               | the forest on the bottom| 
T W W T T    |               | right is bigger with 10 | 
T W T T T    |               | trees.Hence the output  |
W W T T T    |		     | is 10.                  |
--------------------------------------------------------
"""

def CheckifTree(N, forest_land, row, col):

    if(row >= 0 and row < N and col >= 0 and col < N and forest_land[row][col] == "T"):
        
        return True
    
    else:
        
        return False

def TraverseToGetForest(N, forest_land, row, col):

    visited = "V"
    forest_land[row][col] = visited
    row_vector = [0, -1, 0, 1]
    col_vector = [-1, 0, 1, 0]

    count = 1

    for i in range(len(row_vector)):

        if(CheckifTree(N, forest_land, row + row_vector[i], col + col_vector[i])):
            
            count += TraverseToGetForest(N, forest_land, row + row_vector[i], col + col_vector[i])

    return count


def GetMaxForestArea(N, forest_land):

    max = -1

    for row in range(len(forest_land)):

        for col in range(len(forest_land)):

            if CheckifTree(N, forest_land, row, col):

                value = TraverseToGetForest(N, forest_land, row, col)

                if(max < value):

                    max = value
    print(max)

#main method
N = int(input())
forest_land = []
for i in range(N):

    temp_list = list(map(str, input().split((" "))))

    forest_land.append(temp_list)

GetMaxForestArea(N, forest_land)
