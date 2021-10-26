def bsearch(list, val):
   list_size = len(list) - 1
   idx0 = 0
   idxn = list_size
    
#middle most value
   while idx0 <= idxn:
      midVal = (idx0 + idxn)// 2
      if list[midVal] == val:
         return midVal
        
# Compare the value the middle most value
   if val > list[midVal]:
      idx0 = midVal + 1
   else:
      idxn = midVal - 1
   if idx0 > idxn:
      return None
    
# Initialize the sorted list
list = [2,7,19,34,53,72, 56, 90, 47, 98, 1]

# Print the search result
print(bsearch(list,90))
print(bsearch(list,1))
print(bsearch(list,56))
print(bsearch(list,53))
