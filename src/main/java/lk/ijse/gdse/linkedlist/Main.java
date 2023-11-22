package lk.ijse.gdse.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBegining(10);
        linkedList.insertAtBegining(20);
        linkedList.insertAtBegining(30);
        linkedList.insertAtBegining(40);

        linkedList.insertAtEnding(50);

        linkedList.traverse();

        linkedList.insertAtPosition(50 , 2);

        linkedList.traverse();

        linkedList.deleteAtBegining();

        linkedList.deleteAtEnding();

        linkedList.deleteAtPosition(2);

        linkedList.traverse();

        System.out.println("Size" + linkedList.size());

        System.out.println("get(2)" + linkedList.get(2));
    }
}
