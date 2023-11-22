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
        if (isFull()){
            grow();
        }

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

    public int size(){
        return rear - front + 1;
    }

    public void clear(){
        front = -1;
        rear = -1;
    }

    public void printQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty !");
            return;
        }
        System.out.print("[ ");
        for (int i = front; i <= rear ; i++) {
            System.out.print(elementData[i] + "  ");
        }
        System.out.print("]");
    }

    public boolean isFull(){
        return rear == elementData.length - 1;
    }

    private void grow(){
        int[] temp = elementData;

        elementData = new int[elementData.length * 2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }

    public boolean isEmpty(){
        return front == -1;
    }
}
