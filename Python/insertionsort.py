# Implement insertion sort in Python

def insertionSort(array):
    n = len(array)
    for j in range(1, n):
        key = array[j]
        i = j-1
        while (i > -1) and (array[i] > key):
            array[i+1] = array[i]
            i -= 1

        array[i+1] = key