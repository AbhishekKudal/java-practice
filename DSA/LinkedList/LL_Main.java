public class LL_Main {
    public static void main(String[] args) throws Exception {
        LL list = new LL(0);

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.insert(500, 3);

        list.insertLast(99);

        System.out.println(list.deleteFirst());

        list.display();
        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        System.out.println(list.find(2));

    }
}
