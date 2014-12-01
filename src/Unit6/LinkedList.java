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
            return 0;
        }
    }

    @Override
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        System.out.println("Linked list is empty");
    }

    @Override
    public void addAtFront(String str) {
        Node newNode = new Node(str);

        newNode.setNext(this.head);
        this.head = newNode;

    }

    @Override
    public void addAtEnd(String str) {
        // adds a node before the end
        Node newNode = new Node(str);

        this.tail.setNext(newNode);
        this.tail = newNode;

    }

    @Override
    public void remove(String str) {
        Node current = this.head;

        while (current.getData().equalsIgnoreCase(str)) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        
        

    }

    @Override
    public void toString(LinkedList str) {
        Node current;
        current = this.head;
        do {

            System.out.println(current.getData());
            current = current.getNext();
        } while (current != null);

    }

    public static void main(String[] args) {

        LinkedList Alexis2 = new LinkedList();

        Alexis2.addAtFront("a");
        Alexis2.addAtFront("pp");
        Alexis2.addAtFront("Ka");

      
        
        
        Alexis2.toString(Alexis2);

    }

}
