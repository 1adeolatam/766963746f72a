/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

/**
 *
 * @author 1adeolatam
 */
public class LinkedList implements LinkListInterface {

    public int size = 0;

    public Node head;
    public Node tail;

    public LinkedList() {

    }

    @Override
    public int size() {
        if (this.head != null) {
            int length = 0;
            Node current = this.head;
            do {
                current = current.getNext();
                length++;
            } while (current != null);
            this.size = length;
            return length;
        } else {
            empty();
            return 0;
        }
    }

    @Override
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        empty();
    }

    @Override
    public void addAtFront(String str) {
        if (this.head != null) {
            Node newNode = new Node(str);

            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            listEmpty(str);
        }

    }

    @Override
    public void addAtEnd(String str) {
        if (this.tail != null) {
            Node newNode = new Node(str);

            this.tail.setNext(newNode);
            this.tail = newNode;
        } else {
            listEmpty(str);
        }

    }

    public void listEmpty(String str) {
        Node newNode = new Node(str);
        this.head = newNode;
        this.tail = newNode;
    }

    @Override
    public void remove(String str) {

        Node current = this.head;
        boolean removed = false;

        if (current.getData().equalsIgnoreCase(str)) {
            this.head = current.getNext();
            current.setNext(null);
        } else {

            while (!current.getNext().getData().equalsIgnoreCase(str)) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            removed = true;

        }

    }

    @Override
    public String toString() {
        String Stringu = "";
        if (this.head != null) {
            Node current;
            current = this.head;
            do {

                Stringu = Stringu + (current.getData()) + "  ";
                current = current.getNext();

            } while (current != null);
        } else {
            empty();
        }
        return Stringu;
    }

    public void empty() {
        System.err.println("Linked list is empty");
    }

    public static void main(String[] args) {

        LinkedList Alexis2 = new LinkedList();

        // Test 1 adding nodes at end and before 
        System.out.println("Before size " + Alexis2.size());
        Alexis2.addAtEnd("1st noderino");
        Alexis2.addAtEnd("2rd noderino");
        Alexis2.addAtEnd("3nd noderino");
        Alexis2.addAtEnd("4st noderino");
        Alexis2.addAtFront("Keepo");
        System.out.println(Alexis2.toString());
        System.out.println("After size " + Alexis2.size());

        // Test removing nodes
        System.out.println("Before size " + Alexis2.size());
        Alexis2.remove("2rd noderino");
        System.out.println(Alexis2.toString());
        Alexis2.remove("Keepo");
        Alexis2.remove("4st noderino");
        System.out.println(Alexis2.toString());
        System.out.println("After size " + Alexis2.size());
//        LinkedList asas = new LinkedList();
//
//        asas.addAtEnd("asdas");
//        System.out.println(asas.toString());
//        System.out.println(asas.size());

    }

}
