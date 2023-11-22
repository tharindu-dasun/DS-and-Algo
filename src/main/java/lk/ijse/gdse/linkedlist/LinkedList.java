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

    public void traverse(){
        Node temp = head;

        System.out.print("[");
        while (temp.next != null){
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.print("\b\b]");
    }

    public void insertAtPosition(int data , int position){
        if (position==0){
            insertAtBegining(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp =temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }
}
