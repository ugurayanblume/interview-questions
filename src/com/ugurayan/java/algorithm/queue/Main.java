package com.ugurayan.java.algorithm.queue;



public class Main {
    static Queue first = new Queue();

    public static void main(String[] args) {

        first.enqueue(5);
        first.enqueue(7);
        first.enqueue(9);
        System.out.println(first.toString());

        first.dequeue();
        System.out.println(first.toString());
    }
}
