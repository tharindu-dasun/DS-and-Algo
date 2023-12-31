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

    public void deleteAtBegining(){
        if (head==null){
            System.out.println("List is empty !");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnding(){
        if (head==null){
            System.out.println("List is empty !");
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int position){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if(position == 0) {
            deleteAtBegining();
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public int size(){  // complete naaa
        int count = 0;

        Node temp = head;

        return count;
    }

    public int get(int position){
        if (head == null){
            System.err.println("List is empty");
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}
