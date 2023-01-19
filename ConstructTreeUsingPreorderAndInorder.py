from sys import stdin, setrecursionlimit
import queue

setrecursionlimit(10 ** 6)


#Following is the structure used to represent the Binary Tree Node
class BinaryTreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

"""
Approach 1: Recursion
Intuition

The two key observations are:

Preorder traversal follows Root -> Left -> Right, therefore, given the preorder array preorder, we have easy access to the root which is preorder[0].

Inorder traversal follows Left -> Root -> Right, therefore if we know the position of Root, we can recursively split the entire array into two subtrees.

Now the idea should be clear enough. We will design a recursion function: it will set the first element of preorder as the root, and then construct the entire tree. To find the left and right subtrees, it will look for the root in inorder, so that everything on the left should be the left subtree, and everything on the right should be the right subtree. Both subtrees can be constructed by making another recursion call.

It is worth noting that, while we recursively construct the subtrees, we should choose the next element in preorder to initialize as the new roots. This is because the current one has already been initialized to a parent node for the subtrees.
Algorithm

Build a hashmap to record the relation of value -> index for inorder, so that we can find the position of root in constant time.
Initialize an integer variable preorderIndex to keep track of the element that will be used to construct the root.
Implement the recursion function arrayToTree which takes a range of inorder and returns the constructed binary tree:
if the range is empty, return null;
initialize the root with preorder[preorderIndex] and then increment preorderIndex;
recursively use the left and right portions of inorder to construct the left and right subtrees.
Simply call the recursion function with the entire range of inorder.
"""

def buildTree(preOrder, inOrder, n) :
	#Your code goes here

        def array_to_tree(left, right):
            nonlocal preorder_index
            # if there are no elements to construct the tree
            if left > right: return None

            # select the preorder_index element as the root and increment it
            root_value = preOrder[preorder_index]
            root = BinaryTreeNode(root_value)


            preorder_index += 1

            # build left and right subtree
            # excluding inorder_index_map[root_value] element because it's the root
            root.left = array_to_tree(left, inorder_index_map[root_value] - 1)
            root.right = array_to_tree(inorder_index_map[root_value] + 1, right)

            return root

        preorder_index = 0

        # build a hashmap to store value -> its index relations
        inorder_index_map = {}
        for index, value in enumerate(inOrder):
            inorder_index_map[value] = index

        return array_to_tree(0, len(preOrder) - 1)



