# Implement bubblesort in Python

def bubble_sort(arr):

    n = len(arr)
    temp = 0
    for i in range(n):
        for j in range(n-i):
            if arr[j-1] > arr[j]:
                # swap elements
                temp = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = temp
