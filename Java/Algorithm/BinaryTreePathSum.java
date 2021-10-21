/* 
Path Sum

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Constraints:
The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
 */


import java.io.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    boolean hasPathSum(int targetSum) {
        return this.isPathValid(0, targetSum);
    }

    boolean isPathValid(int currentSum, int targetSum) {
        if (this == null)
            return false;
        if (this.left == null && this.right == null) {
            if (this.val + currentSum == targetSum)
                return true;
            else
                return false;
        }
        boolean isLeft = false, isRight = false;
        if (this.left != null) {
            isLeft = this.left.isPathValid(this.val + currentSum, targetSum);
        }
        if (this.right != null) {
            isRight = this.right.isPathValid(this.val + currentSum, targetSum);
        }
        return isLeft || isRight;
    }
}

class Solution {

    public static void main(String[] args) throws java.lang.Exception {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.left.left = new TreeNode(11);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.right = new TreeNode(2);

        int target = 22;

        boolean result = tree.hasPathSum(target);

        if (result == true)
            System.out.println("Path Sum exists");
        else
            System.out.println("Path Sum does not exist");
    }
}