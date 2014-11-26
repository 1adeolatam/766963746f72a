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

   protected int actualfront;
    protected int actualback;
    
    public Queue(int length) {
        this.length = length;
        this.Array = new int[length];
        this.actualfront = -1;
        this.actualback = -1;
    }


    public void enqueue(int number) {
        if (isEmpty()) {
            this.front = 0;
            this.back = 0;
        }
        if (isFull()) {
            this.actualfront++;
            this.front = this.actualfront % this.length;
            this.actualback++;
            this.back =  this.actualback % this.length;
           
        }

        this.actualback++;
        this.Array[this.actualback % this.length] = number;

    }

    public int dequeue() {
   

        if (!isEmpty()) {
            int first = this.Array[this.front];

            this.actualfront++;
            this.front = this.actualfront % this.length;
            if (this.front == this.back) {
                makeEmpty();
            }

            return first;
        } else {
            System.err.println("THE QUEUE IS EMPTY");
        }
        return -21121;
    }

    public boolean isFull() {
        if(Math.abs(actualback - actualfront)== this.length -1){
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
        if (this.front == -1 && this.back == -1) {
            return true;
        }

        return false;

    }

    public void makeEmpty() {
        this.actualfront = -1;
        this.actualback = -1;
    }

    public static void main(String[] args) {

    }

    
 

}

