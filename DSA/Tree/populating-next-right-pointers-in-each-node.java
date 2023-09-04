// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/


class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }

        Node leftMost = root;

        while(leftMost.left != null){
            Node current = leftMost;

            while(current != null){
                //connecting child nodes eg. 2 and 3
                current.left.next = current.right;

                if(current.next != null){
                    //connecting 5 and 6
                    current.right.next = current.next.left;
                }

                current = current.next;
            }

            leftMost = leftMost.left;
        }

        return root;
    }
}
