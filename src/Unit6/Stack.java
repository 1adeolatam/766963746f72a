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
public class Stack implements StackInterface {

    /**
     * @param args the command line arguments
     */
    protected int[] Array;

    private static int top;
    int length;

    public Stack(int size) {
        Array = new int[size];
        length = size;
        top = -1;
    }

    @Override
    public int top() {
        if (!isEmpty()) {
            return Array[top];
        } else {
            System.err.println("CANT TOP THE BOP because STACK is EMPTY");    
        }
        return -1;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int popped = Array[top];
            top--;
            return popped;

        } else {
            System.err.println("CANT POP THE BOP because STACK is EMPTY");
        }
        return -1;
    }

    @Override
    public void push(int num) {
        if (!isFull()) {
            top++;

            Array[top] = num;
        } else {
            System.err.println("FULL Can't push ");
        }
    }

    @Override
    public int size() {
        return top + 1;

    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }

        return false;

    }

    @Override
    public boolean isFull() {
        if (top == length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void makeEmpty() {
        top = -1;
    }

    public void makeFull(){
        top = length -1;
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

}
