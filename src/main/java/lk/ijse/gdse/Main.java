package lk.ijse.gdse;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);

            int peek = stack.peek();

        System.out.println("Peek: " + peek);

        stack.push(40);
        System.out.println("Peek: " + stack.peek());

        stack.push(50);
        System.out.println("Peek: " + stack.peek());;

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        stack.PrintStack();
    }
}