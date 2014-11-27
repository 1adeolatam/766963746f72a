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
public class Queue  {

    protected int[] Array;

    protected static int front;
    protected static int back;
    int length;


    
    public Queue(int length) {
        this.length = length;
        this.Array = new int[length];
        this.front = -1;
        this.back = -1;
    }


    public void enqueue(int number) {
        if (isEmpty()) {
            this.front = 0;
            this.back = 0;
        }
        if (isFull()) {
            this.front++;
            this.front = this.front % this.length;
            this.back++;
        
           
        }
        
        this.back++;
        this.Array[this.back ] = number;
        this.length++;
    }

    public int dequeue() {
   

        if (!isEmpty()) {
            int first = this.Array[this.front];

            this.front++;
            this.front = this.front % this.length;
            if (this.front == this.back) {
                makeEmpty();
            }
            this.length--;
            return first;
        } else {
            System.err.println("THE QUEUE IS EMPTY");
        }
        return -21121;
    }

    public boolean isFull() {
        if(Math.abs(back - front)== this.length -1){
            return true;
        }
           return false;
        
    }
    
    public int size(){
        if(isEmpty())
            return 0;
        
        if(isFull())
            return this.length;
        else
            return (int) Math.abs(this.back - this.front);
        
    }

    public boolean isEmpty() {
        return this.front == -1 && this.back == -1;

    }

    public void makeEmpty() {
        this.front = -1;
        this.back = -1;
    }

    public static void main(String[] args) {

    }

    
 

}

