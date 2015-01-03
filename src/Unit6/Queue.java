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
import edu.hdsb.gwss.muir.ics4u.u6.QueueInterface;

public class Queue implements QueueInterface {

    protected int[] Array;

    protected int front;
    protected int back;

    public Queue(int length) {

        this.Array = new int[length];
        this.front = -1;
        this.back = -1;
    }

    public void enqueue(int number) {

        if (isEmpty()) {
            this.front = 0;
            this.back = 0;

            this.Array[this.front] = number;
            System.out.println("The number " + number + " has been added to " + this.front);

        } else if (isFull()) {
            System.out.println("THe number " + number + " WAS NOT ADDED. ");
            System.out.println("The QUEUE IS FULL CAN NOT ENQUEUE.");
        } else {
            this.back++;
            this.back = this.back % this.Array.length;
            this.Array[this.back] = number;

            System.out.println("The number " + number + " has been added to " + this.back);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int first = this.Array[this.front];
            this.Array[this.front] = 0;
            System.out.println("This is the front value " + first);
           if(this.front == this.back){
               makeEmpty();
               return first;
           }
            this.front++;
            this.front = this.front % this.Array.length;
            
          
            return first;
        } else {
            System.err.println("THE QUEUE IS EMPTY");
        }
        
        return -1;
    }

    public boolean isFull() {
        if (this.front < this.back) {
            if (this.back + 1 == this.Array.length && this.front == 0) {
                return true;

            }
        } else if (this.back < this.front) {
            if (this.front - this.back == 1) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }else if (this.front < this.back) {
            return this.back - this.front + 1;
        } else if (this.back < this.front) {
            return (this.Array.length - front) + this.back + 1;
        } else {
            return 1;
        }
    }

    public boolean isEmpty() {
        if (this.front == -1) {
            return true;
        }
        return false;
    }

    public void makeEmpty() {
        this.front = -1;
        this.back = -1;
    }

    public void displayQueue() {
        for (int i = 0; i < this.Array.length; i++) {
            if (this.front == i && this.back == i) {
                System.out.format("%4s", "FB");
            } else if (this.front == i) {
                System.out.format("%4s", "F-");
            } else if (this.back == i) {
                System.out.format("%4s", "B-");
            } else {
                System.out.format("%4s", "");
            }
        }
        System.out.println();
        for (int i = 0; i < this.Array.length; i++) {
            System.out.format("%4s", this.Array[i] + "-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue Kyu = new Queue(6);

        Kyu.makeEmpty();
        Kyu.enqueue(3);
        Kyu.enqueue(4);

        Kyu.dequeue();
                Kyu.dequeue();

        for(int i = 0; i < 6; i++){
            System.out.println(Kyu.Array[i]);
        }
        System.out.println("Size is "+Kyu.size());
    }

    @Override
    public int front() {
        if(isEmpty()){
            System.out.println("EMPTY");
            return -21;
        }
        return this.Array[this.front];
        
    }

    @Override
    public int back() {
         if(isEmpty()){
            System.out.println("EMPTY");
            return -21;
        }
        return this.Array[this.back];
    }

    @Override
    public int capacity() {

        return this.Array.length;
    }

}
