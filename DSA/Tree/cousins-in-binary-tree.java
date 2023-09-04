// https://leetcode.com/problems/cousins-in-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
Steps to solve:
 Get the nodes
 Check if they are siblings (child of same parent)
 Check if they are on the same level/height
 */

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = getNode(root, x);
        TreeNode yy = getNode(root, y);

        boolean isSiblings = isSiblings(root, xx, yy);

        int levelX = getLevel(root, xx, 0);
        int levelY = getLevel(root, yy, 0);

        return (!isSiblings && (levelX == levelY));
    }

    TreeNode getNode(TreeNode node, int x){
        if(node == null){
            return null;
        }

        if(node.val == x){
            return node;
        }

        TreeNode left = getNode(node.left, x);
        
        if(left!= null){
            return left;
        }

        return getNode(node.right, x);
    }

    boolean isSiblings(TreeNode node, TreeNode x, TreeNode y){
        if(node == null){
            return false;
        }

        return(
            (node.left == x && node.right == y) || (node.left == y && node.right == x) || 
            isSiblings(node.left, x, y) || isSiblings(node.right, x, y)
        );
    }

    int getLevel(TreeNode node, TreeNode x, int level){
        if(node == null){
            return 0;
        }

        if(node == x){
            return level;
        }

        int left = getLevel(node.left, x, level + 1);
        if(left != 0){
            return left;
        }

        return getLevel(node.right, x, level + 1);
    }

}
