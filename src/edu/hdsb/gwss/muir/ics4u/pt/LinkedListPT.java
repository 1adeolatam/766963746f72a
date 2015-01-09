package edu.hdsb.gwss.muir.ics4u.pt;

/**
 * Linked List of Students
 *
 * @version v2014.S1
 */
public class LinkedListPT {

    private NodePT head;
    private NodePT tail;

    /**
     * Constructor: Empty Linked List
     */
    public LinkedListPT() {
        this.head = null;
        this.tail = null;
    }

    /**
     * @return returns the size (# of students) in the linked list.
     */
    public int size() {
        if (this.head != null) {
            int length = 0;
            NodePT current = this.head;
            do {
                current = current.getNext();
                length++;
            } while (current != null);

            return length;
        } else {

            return 0;
        }

    }

    /**
     * This method makes the linked list empty.
     */
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
    }

    /**
     * This method returns true if the linked list is empty
     *
     * @return returns true if there are no student objects in the linked list
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * This method adds a student object to the end of the linked list.
     *
     * @param student
     */
    public void addAtEnd(CSStudent student) {
    
            NodePT newNode = new NodePT(student);
           if (isEmpty()) {
            newNode.setNext(null);
            newNode.setPrev(null);
            this.head = newNode;
            this.tail = newNode;
            } else if (this.tail != null) {

                this.tail.setNext(newNode);
                newNode.setPrev(this.tail);
                this.tail = newNode;
            }
        

    }

   

    /**
     * This method will get a student object from the linked list, given the
     * student number
     *
     * @param key student number (key)
     * @return returns the student object for the given key, or null if it
     * doesn't exist.
     */
    public boolean exists(int key) {
        NodePT current = this.head;
        boolean existss = false;
        int counter = 0;
        while (!existss && counter < size()) {

            if (current.getData().getKey() == key) {
                existss = true;
            } else {
                counter++;
                current = current.getNext();

            }

        }

        return existss;

    }

    public CSStudent get(int key) {
        NodePT current = this.head;
        boolean found = false;
        int counter = 0;
        while (!found && counter < size()) {

            if (current.getData().getKey() == key) {
                return current.getData();
            } else {
                counter++;
                current = current.getNext();
            }

        }
        return null;
    }

    /**
     * This method will remove a student object from the linked list, given the
     * student number.
     *
     * @param key student number (key)
     * @return returns the removed student object, or null if the key is not
     * found
     */
 public void remove(int key) {
        NodePT current = this.head;
        if (exists(key)) {
            if (size() == 1) {
                this.head = null;
                this.tail = null;
            } else if (size() == 0) {
                System.out.println("Empty List.");
            } else {
                if (this.head.getData().getKey() == key) {
                    this.head = this.head.getNext();
                    this.head.getPrev().setNext(null);
                    this.head.setPrev(null);
                } else if (this.tail.getData().getKey() == key){
                    this.tail = this.tail.getPrev();
                    this.tail.getNext().setPrev(null);
                    this.tail.setNext(null);
                } else {
                    boolean found = false;
                    while (!found) {
                        if (current.getData().getKey()==key) {
                            current.getNext().setPrev(current.getPrev());
                            current.getPrev().setNext(current.getNext());
                            current.setNext(null);
                            current.setPrev(null);
                            found = true;        
                        } else {
                            current = current.getNext();
                        }
                    }
                }
            }
        } else {
            System.out.println("Does not Exist.");
        }
    }

    /**
     * DONE FOR YOU
     */
    @Override
    public String toString() {
        return "HEAD: " + toString(this.head);
    }

    /**
     * DONE FOR YOU
     */
    private String toString(NodePT n) {
        String s = "";
        if (n != null) {
            s = n.getData().toString()+ " --> " + this.toString(n.getNext());
        }
        return s;
    }

}
