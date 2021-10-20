from binarytree import heap

# random max-heap for a given height 
root2 = heap(height = 2)
 
print('Max-heap for given height : \n',
      root2)

# min-heap of given height
root3 = heap(height = 2,
             is_max = False,
             is_perfect = True)
 
print('Perfect min-heap for given height : \n',
      root3)
      
# max-heap - random
root = heap()
print('Max-heap: \n',
      root)
 
