public class DLL {

    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        //What if list is empty?

        if(head == null){
            insertFirst(value);
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public Node find(int val){
        Node temp = head;

        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int afterValue, int value){
        Node prev_node = find(afterValue);

        if (prev_node == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = prev_node.next;
        prev_node.next = node;
        node.prev = prev_node;
        if(node.next != null){
            node.next.prev = node; 
        }
    }

    public void display(){
        System.out.println("Printing normally");
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int value;
        Node next;
        Node prev;
        
        public Node(int value) {
            this.value = value;
        }

        /*  -- Commented as it's never used
        public Node(int value, DLL.Node next, DLL.Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        */
    }
}
