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

        stack.push(40);
        System.out.println("Peek: " + stack.peek());;

        stack.push(50);
        System.out.println("Peek: " + stack.peek());;



        stack.PrintStack();

        stack.push(500);

        stack.PrintStack(); //[10 20 30 400 500]

        stack.push(600);    //Stack is full
        stack.PrintStack(); //

        stack.push(700);    //Stack is full
        stack.PrintStack(); //

        System.out.println("Size " + stack.size());
    }
}