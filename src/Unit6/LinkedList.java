/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

import edu.hdsb.gwss.muir.ics4u.u6.LinkListInterface;

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
            newNode.setPrev(null);
            this.head = newNode;
            this.head.getNext().setPrev(this.head);

        } else {
            listEmpty(str);
        }

    }

    @Override
    public void addAtEnd(String str) {
        if(isEmpty()){
            addAtFront(str);
        }
        else if (this.tail != null) {
            Node newNode = new Node(str);

            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
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
        if (exists(str)) {
            if (current.getData().equalsIgnoreCase(str)) {

                this.head = current.getNext();
                current.setNext(null);

            } else {
                if (current.getNext() != null) {

                    int counter = 1;
                    while (current.getNext().getData().equalsIgnoreCase(str)) {

                        counter++;

                        System.out.println(counter);

                        current = current.getNext();

                    }
                    current.setNext(current.getNext().getNext());
                } else {
                    System.out.println("The node does not exist.");
                }

            }
        } else {
            System.out.println("DOES NOT EXIST LIKE.");
        }
    }

    public boolean exists(String str) {
        Node current = this.head;
        boolean existss = false;
        int counter = 0;
        while (!existss && counter < size()) {

            if (current.getData().equalsIgnoreCase(str)) {
                existss = true;
            } else {
                counter++;
                current = current.getNext();

            }

        }

        return existss;

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
        System.out.println("Linked list is empty");
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // EMPTY
        assert (ll.size() == 0);
        assert (ll.isEmpty());

        // REMOVE: EMPTY
        System.out.println("CASE 1: REMOVE NON EXISTING");
        ll.remove("ABC");

        // ADD @ FRONT; SIZE 1
        System.out.println("CASE 2: ADD AT FRONT / REMOVE ONLY ELEMENT");
        ll.addAtFront("ABC");
        System.out.println("DATA: " + ll.toString());
        ll.remove("ABC");
        assert (ll.size() == 0);
        assert (ll.isEmpty());

        // ADD @ END; SIZE 1
        System.out.println("CASE 3: ADD AT END / REMOVE ONLY ELEMENT");
        ll.addAtEnd("ABC");
        System.out.println("DATA: " + ll.toString());
        ll.remove("ABC");
        assert (ll.size() == 0);
        assert (ll.isEmpty());

        // ADD @ FRONT; SIZE 2
        System.out.println("CASE 4: ADD AT FRONT / REMOVE 2 ELEMENT");
        ll.addAtFront("ABC");
        ll.addAtFront("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 2);
        ll.remove("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 1);
        ll.remove("ABC");
        System.out.println("DATA: " + ll.toString());

        // ADD @ BACK; SIZE 2
        System.out.println("CASE 5: ADD AT END / REMOVE 2 ELEMENT");
        ll.addAtEnd("ABC");
        ll.addAtEnd("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 2);
        ll.remove("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 1);
        ll.remove("ABC");
        System.out.println("DATA: " + ll.toString());

        // REMOVE; MIDDLE
        System.out.println("CASE 6: REMOVE TWO ELEMENTS");
        ll.addAtFront("ABC");
        ll.addAtFront("123");
        ll.addAtFront("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 3);
        ll.remove("123");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 2);
        ll.remove("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 1);
        ll.remove("ABC");
        System.out.println("DATA: " + ll.toString());
    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

}
