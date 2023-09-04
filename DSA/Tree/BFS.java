//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

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
 */

/*
Complexity -

Time - O(n) as we are visiting each node once
Space - O(n/2) ~~ O(n) - as the leaf node = n/2

*/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(! queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevelList = new ArrayList<>(levelSize);

            for(int i=0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevelList.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }

            result.add(currentLevelList);
        }

        return result;
    }
}
