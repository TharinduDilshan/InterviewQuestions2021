// Given a binary tree
/*
                        45
                       /  \
                     38    47
                    /  \   /  \
                  23   39 45   60

1) How many nodes searched to find the node containing 45? 
    3

2) How many nodes searched to find the node containing 50? 
    4

3) What will the inorder list representation of this tree be?
    inorder: 23 38 39 45 45 47 60

4) Assuming the tree is a class "Tree", and the nodes are class "TreeNodes", write
   a template "preorder" function and display the output of this tree.
   Expected preorder output: 45 38 23 39 47 45 60
*/

#include <iostream>
using namespace std;

// ASSUMED
template<class Type>
class TreeNode
{
public:
    TreeNode<Type>* treePtr;
};

// ASSUMED
template<class Type>
class Tree
{
public:
    Tree<Type> tree;

// Expected response below
template<class Type>
void Tree<Type>::preorder(TreeNode<Type>* treePtr)
{
    if (treePtr) // !=NULL
    {
        cout << treePtr->data << " ";
        preorder(treePtr->left);
        preorder(treePtr->right);
    }
}
};



