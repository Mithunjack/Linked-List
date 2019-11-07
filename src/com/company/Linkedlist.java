package com.company;

public class Linkedlist {
        Element head,tail;
    public class Element{
        int value;
        Element next;

        Element(int number){
            this.value =  number;
            this.next = null;
        }
        public void addNextElement(Element reference){
            this.next = reference;
        }
    }
    Linkedlist(){
        this.head = null;
        this.tail = null;
    }
    public void addElement(int value){
        if (head==null){
            head = new Element(value);
            tail=head;
        }
        else {
            tail.addNextElement(new Element(value));
            tail = tail.next;
        }
    }
    public int removeElement(){
        if (head==null){
            return 0;
        }
        else {
            int value = head.value;
            head = head.next;
            return value;
        }
    }
    public void printElement(){
        Element print;
        print = head;
        while (print!=null){
            System.out.println("Link list Value: " + print.value);
            print = print.next;
        }
    }
}
