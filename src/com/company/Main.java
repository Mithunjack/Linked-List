package com.company;

public class Main {

    public static void main(String[] args) {
        Linkedlist element = new Linkedlist();
        element.addElement(10);
        element.addElement(20);
        element.addElement(30);
        int removeValue = element.removeElement();
        System.out.println("Removed Value " + removeValue);

        element.addElement(50);
        element.printElement();

    }
}
