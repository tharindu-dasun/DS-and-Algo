package lk.ijse.gdse.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQue(10);
        queue.enQue(20);
        queue.enQue(30);

        queue.deQueue();

        System.out.println(queue.peek());

    }
}
