//https://leetcode.com/problems/copy-list-with-random-pointer

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

//Time - O(n) - as we are iterating throgh the whole linked list
//Space - O(n) as we are taking extra hashMap

//** Cannot be solved in the time less than O(n) as we have to visit every node at least once. O(n) is the best case

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        
        Map<Node, Node> map = new HashMap<>();

        //Copy all the nodes and store in HashMap as <oldNode, newNode>
        Node node = head;

        while(node != null){
            map.put(node, new Node(node.val));
            node = node.next;
        }

        //Now map has all the old-new node pairs
        //Assign next and random pointers
        node = head;

        while(node != null){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }
}

//Time - O(n)
//Space - O(1) ¬

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        //Step 1 - create a new node and insert at the current list

        Node node = head;

        while(node != null){
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }

        // Step 2: Update random pointers of duplicated nodes
         node = head;

         while(node != null){
             if(node.random != null){
                node.next.random = node.random.next;
             }

             node = node.next.next;
         }

        // Step 3: Separate the original and duplicated linked lists
        node = head;
        Node newHead = node.next;
        Node newCurrent = newHead;

        while(node != null){
            
            node.next = newCurrent.next;
            node = node.next;

            if(node != null){
                newCurrent.next = node.next;
                newCurrent = newCurrent.next;
            }
        }
        return newHead;
    }
}
