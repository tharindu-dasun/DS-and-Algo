package lk.ijse.gdse.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQue(10);
        queue.enQue(20);
        queue.enQue(30);
        queue.enQue(40);
        queue.enQue(50);
        queue.enQue(60);
        queue.enQue(70);
        queue.enQue(80);
        queue.enQue(90);

        queue.deQueue();  //[10,20,30] --> mulinma thiyena eka remove wenawa --> 10 remove
        queue.deQueue();
        System.out.println(queue.peek());    // dn mulinm THIYENA EKA PRINT WENAWA ---> 20 print

        queue.printQueue();

        System.out.println("Size : " + queue.size());


    }
}
