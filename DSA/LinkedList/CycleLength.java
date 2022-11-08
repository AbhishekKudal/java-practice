// Amazon And Microsoft

//Find out the length of the cycle if the head is given 

public static int CycleLength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode temp = slow;
                int length = 0;

                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);

                return length;
            }
        }
        return 0;
    }
