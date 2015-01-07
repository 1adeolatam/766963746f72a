




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1adeolatam
 */
public class Node20 {
    

  
    
      private Node20 before;  
    private Node20 next;  
    
    public int number;

    public Node20() {
        
    }

    public Node20(Node20 before, Node20 next, int number) {
        this.before = before;
        this.next = next;
        this.number = number;
    }

    
    
    
    
    public Node20 getBefore() {
        return before;
    }

    public void setBefore(Node20 before) {
        this.before = before;
    }

    public Node20 getNext() {
        return next;
    }

    public void setNext(Node20 next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    
    
}
