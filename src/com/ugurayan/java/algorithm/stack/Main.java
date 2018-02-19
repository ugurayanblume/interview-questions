package com.ugurayan.java.algorithm.queue;


public class Main {

    static Queue first = new Queue(10);

    public static void main(String[] args) {
        addNode(5);
        printLinkedList();

        addNode(16);
        printLinkedList();

        addNode(3);
        addNode(new Node (6));
        printLinkedList();

        deleteNode( new Node(16));
        printLinkedList();

    }

    public static void addNode(Node a) {
        Node head = first;

        while(head.next != null) {
            head = head.next;
        }
        head.next = a;
    }

    public static void addNode(int a) {
        Node temp = new Node(a);
        Node head = first;

        while(head.next != null) {
            head = head.next;
        }
        head.next = temp;
    }

    public static void deleteNode(Node a) {
        Node head = first;

        while (head.next  != null){
            if (head.data == a.data) {
                head.data = head.next.data;
                head.next= head.next.next;
            }
            head = head.next;
        }
    }

    public static void printLinkedList() {

        Node temp = first;
        int i = 0;

        System.out.print( i + ":(" + temp.data + ")");
        while (temp.next != null) {
            ++i;
            temp = temp.next;
            System.out.print( " > " + i + ":(" + temp.data + ")");
        }
        System.out.println();

    }
}
