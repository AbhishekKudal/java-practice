public class DLL_Main {
    public static void main(String[] args) throws Exception {

        DLL doubleyLL = new DLL();

        //Inserting at first
        doubleyLL.insertFirst(10);
        doubleyLL.insertFirst(20);
        doubleyLL.insertFirst(30);
        doubleyLL.insertFirst(40);

        //Inserting at last
        doubleyLL.insertLast(99);
        doubleyLL.insert(30, 70);
        
        //Displaying the list
        doubleyLL.display();
    }
}
