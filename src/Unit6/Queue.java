/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

import edu.hdsb.gwss.muir.ics4u.u6.QueueInterface;

/**
 *
 * @author 1adeolatam
 */
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
            System.out.println("This is the front " + this.Array[this.front]);
            this.front++;
            this.front = this.front % this.Array.length;
            if (this.front == this.back) {
                makeEmpty();
            }
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
        } else if (this.front < this.back) {
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

    public static void main(String[] args) {

        Queue Kyu = new Queue(6);

        System.out.println("Current queue size is " + Kyu.size());
        // Before : 0
        Kyu.enqueue(5);
        // After: 1

        // Before: 1
        Kyu.enqueue(3);
        // After: 2
        System.out.println("Current queue size is " + Kyu.size());

        System.out.println("Dequeue " + Kyu.dequeue());
        //After: 1

        System.out.println("Current queue size is " + Kyu.size());
        Kyu.enqueue(2);
        Kyu.enqueue(3);
        Kyu.enqueue(4);
        Kyu.enqueue(6252);
        Kyu.enqueue(21);
        Kyu.enqueue(124112415);
        Kyu.enqueue(2415);
        Kyu.dequeue();

        Kyu.enqueue(5);

        System.out.println("IS full?" + Kyu.isFull());
        System.out.println("Current queue size is " + Kyu.size());

    }

    @Override
    public int front() {

        return this.Array[this.front];
    }

    @Override
    public int back() {
        return this.Array[this.back];
    }

    @Override
    public int capacity() {

        return this.Array.length;
    }

}
