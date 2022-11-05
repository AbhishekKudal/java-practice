public class CLL_Main {
    public static void main(String[] args) throws Exception {
        CLL list = new CLL();

        list.insert(12);
        list.insert(33);
        list.insert(52);
        list.insert(17);
        
        list.display();
        list.delete(52);
        list.display();
    }
}
