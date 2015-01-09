

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1adeolatam
 */
public class Linkedlist20{
    
    
    public Node20 head;
  public  Node20 tail;

      public int size = 0;
  
    public Linkedlist20() {
    }
  
  
  
  
    public int size() {
        if (this.head != null) {
            int length = 0;
            Node20 current = this.head;
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
  
  
  public void empty() {
        System.out.println("Linked list is empty");
    }

    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        empty();
    }
    
        public void addAtFront() {
        if (this.head != null){
            Node20 newNode = new Node20();

            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            listEmpty(str);
        }

    }
        
         public void listEmpty(String str) {
        Node20 newNode = new Node20();
        this.head = newNode;
        this.tail = newNode;
    }
  
  
  
}
