package lk.ijse.gdse.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBegining(10);
        linkedList.insertAtBegining(20);
        linkedList.insertAtBegining(30);
        linkedList.insertAtBegining(40);

        linkedList.insertAtEnding(50);

        linkedList.printNode();
    }
}