/*
142. Linked List Cycle II

https://leetcode.com/problems/linked-list-cycle-ii
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        int length = lengthOfCycle(head);
        if(length == 0){
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while(length > 0){
            second = second.next;
            length--;
        }

        while(first != second){
            first = first.next;
            second = second.next;
        }

        return first;
    }

    public int lengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode temp = slow;
                int length = 0;

                do{
                    temp = temp.next;
                    length ++; 
                }while(temp != slow);

                return length;
            }
        }

        return 0;
    }
}
