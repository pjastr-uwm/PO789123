from typing import List


def sumam(A: List[List[int]], B: List[List[int]]) -> List[List[int]]:
    temp = []
    for i in range(0, len(A)):
        temp2 = []
        for j in range(0, len(A[i])):
            temp2.append(A[i][j] + B[i][j])

        temp.append(temp2)
    return temp


A: List[List[int]] = [[2, 3, 4], [-3, 7, 1]]
B: List[List[int]] = [[2, -3, 4], [-3, 2, 1]]
print(sumam(A, B))
C: List[List[int]] = [[2, 3], [-3, 1], [1, 1]]
D: List[List[int]] = [[2, -3], [2, 1], [-5, 3]]
print(sumam(C, D))
