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
        return this.size;
    }

    @Override
    public void makeEmpty() {
        this.size = 0;
    }

    @Override
    public void addAtFront(Node str) {
        str.setNext(this.head);
        this.size++;
    }

    @Override
    public void addAtEnd(Node str) {
        this.tail.setNext(str);
        this.tail = str;
        this.tail.setNext(null);
        this.size++;
    }

    @Override
    public void remove(Node str) {
        Node current;

        
   
        current = this.head;

        while (current.getNext() != str) {
            current = current.getNext();
        }
        current.setNext(str.getNext());
             str.setNext(null);
             this.size--;
    }

    @Override
    public void toString(LinkedList str) {
        Node current;
        current = this.head;
        while(current.getNext()!= null){
            System.out.println(current.getData());
        }
    }
    
    
    
      public static void main(String[] args) {
       
          
          Node node1 = new Node("Ka");
                    Node node2 = new Node("pp");
          Node node3 = new Node("a");

          LinkedList Alexis2 = new LinkedList();
                  
         Alexis2.addAtFront(node3);
      Alexis2.addAtEnd(node2);
      Alexis2.addAtEnd(node1);
          
          Alexis2.toString(Alexis2);
          
          
    }

}
