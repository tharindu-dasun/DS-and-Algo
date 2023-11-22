package lk.ijse.gdse.queue;

public class Queue {
    private int[] elementData;
    private int front;
    private int rear;

    public Queue(int initialCapacity){
        elementData = new int[initialCapacity];
        front = -1;
        rear = -1;
    }

    public void enQue(int data){
        if (front == -1){
            front = 0;
        }

        elementData[++rear] = data;
    }

    public int deQueue(){
        return elementData[front++];
    }

    public int peek(){
        return elementData[front];
    }
}
