/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

import edu.hdsb.gwss.muir.ics4u.u6.StackInterface;


public class Stack implements StackInterface {

    /**
     * @param args the command line arguments
     */
    protected int[] Array;

    private static int top;
    int length;

    public Stack(int size) {
        this.Array = new int[size];
        this.length = size();
        this.top = -1;
    }

    @Override
    public int top() {
        if (!isEmpty()) {
            return this.Array[top];
        } else {
            System.err.println("CANT TOP THE BOP because STACK is EMPTY");
        }
        return -1;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int popped = this.Array[top];
            this.top--;
            return popped;

        } else {
            System.out.println("CANT POP THE BOP because STACK is EMPTY");
        }
        return -1;
    }

    @Override
    public void push(int num) {
        if (!isFull()) {
            this.top++;

            this.Array[top] = num;
        } else {
            System.out.println("FULL Can't push ");
        }
    }

    @Override
    public int size() {
        return this.top + 1;

    }

    @Override
    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }

        return false;

    }

    @Override
    public boolean isFull() {
        if (this.top == this.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void makeEmpty() {
        this.top = -1;
    }

    public void makeFull() {
        this.top = this.length - 1;
    }

    public static void main(String[] args) {
        Stack Stock = new Stack(21);

        // Normal data
        Stock.push(21);
        Stock.push(22);
        Stock.push(23);
        System.out.println("Top :" + Stock.top());

        //testing pop
        Stock.pop();
        System.out.println("Top:" + Stock.top());
        //size
        System.out.println("Size " + Stock.size());

        //making empty then testing top & pop
        Stock.makeEmpty();
        System.out.println(Stock.top());
        System.out.println(Stock.pop());

        //pushing a full stack
        Stock.makeFull();
        Stock.push(21);

    }

    @Override
    public int capacity() {
        return this.Array.length;
    }

}
