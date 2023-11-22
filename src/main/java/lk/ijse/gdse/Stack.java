package lk.ijse.gdse;

public class Stack {
    private int[] elementData;
    private int top;

    public Stack(int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }

//    public void push(int data){
//        elementData[++top] = data;
//        if (top== elementData.length-1){
//
//            System.out.println("Stack is full");
//        }
//    }

    public void push(int data){
        if (isFull()){
            grow();
        }
        elementData[++top] = data;

    }

    public int peek(){
        return elementData[top];
    }

    public int pop(){
        return elementData[top--];
    }

    public boolean isFull(){
        return top == elementData.length - 1;
    }

    public void grow(){
        int[] temp = elementData; //5

        elementData = new int[elementData.length * 2];  // 10
        for (int i = 0; i <= temp.length; i++) {
            elementData[i] = temp[i];
        }
    }

    public void PrintStack(){
        System.out.print("[");
        for (int i = 0; i <= top ; i++) {
            System.out.print(" " + elementData[i] + " ");
        }
        System.out.print("]");
    }

    public int size(){
        return top + 1;
    }
}
