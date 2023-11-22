package lk.ijse.gdse;

public class Stack {
    private int[] elementData;
    private int top;

    public Stack(int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data){
        elementData[++top] = data;
    }

    public int peek(){
        return elementData[top];
    }

    public int pop(){
        return elementData[top--];
    }

    public void PrintStack(){
        System.out.print("[");
        for (int i = 0; i <= top ; i++) {
            System.out.print(" " + elementData[i] + " ");
        }
        System.out.print("]");
    }
}
