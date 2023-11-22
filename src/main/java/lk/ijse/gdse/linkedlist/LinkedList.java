package lk.ijse.gdse.linkedlist;

public class LinkedList {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }
    private Node head;

    public void insertAtBegining(int data){
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void insertAtEnding(int data){
        Node node= new Node(data);

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
