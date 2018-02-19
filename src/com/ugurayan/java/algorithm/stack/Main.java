package com.ugurayan.java.algorithm.stack;


public class Main {

    static Stack first = new Stack();

    public static void main(String[] args) {

        first.push(5);
        first.push(7);
        first.push(9);
        System.out.println(first.toString());

        first.pop();
        System.out.println(first.toString());
    }

}
