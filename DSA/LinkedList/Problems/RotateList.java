/*
*******Google/Microsoft*******

61. Rotate List

https://leetcode.com/problems/rotate-list
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution1Self {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode last = head;
        int length = 0;

        while(last != null){
            last = last.next;
            length++;
        }
        
        int rotations = k % length;

        ListNode first = head;
        ListNode second = first.next;

        for(int i = 0; i < rotations; i++){
            first = head;
            second = first.next;

            while(second != null && second.next != null){
                first = first.next;
                second = second.next;
            }
            first.next = null;
            second.next = head;
            head = second;
        }

        return head;
    }
}

//More efficient solution
class Solution2Kunal {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(true){
            if(k < 2 || head == null){
                return head;
            }

            ListNode newEnd = current;
            ListNode last = prev;
            ListNode node = current;

            for(int i = 0; i < k-1 && node != null; i++){
                node = node.next;
            }

            if(node == null) break;

            for(int i = 0; (current != null) && i < k; i++){
                current.next = prev;
                prev = current;
                current = next;

                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;

            if(current == null){
                break;
            }

            prev = newEnd;
        }
        return head;
    }
}
