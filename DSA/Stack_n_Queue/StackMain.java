public class StackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);

        stack.push(45);
        stack.push(21);
        stack.push(4);

        System.out.println("Peeking" + stack.peek());

        stack.push(96);
        stack.push(15);
        stack.push(255);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
