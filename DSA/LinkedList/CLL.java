public class CLL {

    private Node head;
    private Node tail;

    public void insert(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        Node node = head;
        if(head == null){
            return;
        }

        if(node.val == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node temp = head;

        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println("HEAD");
    }

    private class Node{
        
        private int val; 
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
