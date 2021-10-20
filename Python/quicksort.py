# Implement quicksort in python

def pivot(array, start, end):
 
    #initializing 
    pivot = array[start]
    low = start + 1
    high = end
 
 
    while True:
   
        #moving high towards left
        while low <= high and array[high] >= pivot:
            high = high - 1
 
        #moving low towards right 
        while low <= high and array[low] <= pivot:
            low = low + 1
 
        #checking if low and high have crossed
        if low <= high:
 
            #swapping values to rearrange
            array[low], array[high] = array[high], array[low]
          
        else:
            #breaking out of the loop if low > high
            break
 
    #swapping pivot with high so that pivot is at its right position 
    array[start], array[high] = array[high], array[start]
 
    #returning pivot position
    return high
 
 
def quick_sort(array, start, end):
    if start >= end:
        return
 
    #call pivot 
    p = pivot(array, start, end)
    #recursive call on left half
    quick_sort(array, start, p-1)
    #recursive call on right half
    quick_sort(array, p+1, end)
 
 
array = [5,1,3,9,8,2,7]
quick_sort(array, 0, len(array) - 1)

print(f'Sorted array: {array}')