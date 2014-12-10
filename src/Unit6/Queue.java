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
public class Queue {

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

            this.Array[this.front] = number;
        }
        if (isFull()) {
            this.front++;
            this.front = this.front % this.length;
            this.back++;

        }

        this.Array[this.back] = number;
                this.back++;

        System.out.println("The number " + number + " has been added to " + this.back);
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
        return -1;
    }

    public boolean isFull() {
        if (Math.abs(back - front) == this.length - 1) {
            return true;
        }
        return false;

    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        if (isFull()) {
            return this.length;
        } else {
            return (int) Math.abs(this.back - this.front);
        }

    }

    public boolean isEmpty() {
        return this.front == -1 && this.back == -1;

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
        Kyu.enqueue(1);

        Kyu.enqueue(6);
                System.out.println("Current queue size is " + Kyu.size());


    }

}
