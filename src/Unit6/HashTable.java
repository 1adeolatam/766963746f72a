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
public class HashTable implements HashTableInterface {

    public int[] array;
int collisions = 0;
    public HashTable() {
        this.array = new int[51];
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = -1;
        }
        System.out.println("There are " + size() + " elemenets in this table.");
    }

    @Override
    public void resize() {
       
            int[] nextarray = new int[nextPrime(capacity())];

            System.arraycopy(this.array, 0, nextarray, 0, this.array.length);

            this.array = nextarray;
            System.out.println("New array size = " + this.array.length);

    }

    @Override
    public int size() {
        int totalCounted = 0;

        for (int i = 0; i < this.capacity(); i++) {
            if (this.array[i] > -1) {
                totalCounted++;
            }
        }

        return totalCounted;
    }

    @Override
    public double loadFactor() {
        double lf;
        lf = (double) this.size() / this.capacity() * 100.0;
        return lf;
    }

    // Stack overflow http://stackoverflow.com/questions/22082770/next-prime-number-java-only-working-with-certain-numbers
    public int nextPrime(int capacity) {
        capacity = capacity * 3;
        boolean isPrime = false;
        int m = (int) Math.ceil(Math.sqrt(capacity));
        int start = 3;
        capacity++;
        if (capacity % 2 == 0) {
            capacity = capacity + 1;
        }
        while (!isPrime) {
            isPrime = true;
            for (int i = start; i <= m; i = i + 2) {
                if (capacity % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                capacity = capacity + 2;
            }
        }

        return capacity;
    }

    @Override
    public int capacity() {
        return this.array.length;
    }

    @Override
    public void makeEmpty() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = -1;
        }

    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }

        return false;

    }

    @Override
    public void put(int value) {

        if (loadFactor() < 75.0) {

            System.out.println("Load Factor before adding " + loadFactor() + "%.");
              array[value] = value;
            System.out.println("Value " + value + " has been added at index " + hash(value));
          

        } else {
            if(loadFactor()>= 75.0){
            resize();
            }
            put(value);
        }
    }

    @Override
    public boolean containsKey(int key) {
        if (this.array[key] < 0) {
            return false;
        }
        return true;
    }

    @Override
    public int get(int key) {
        System.out.println("Returning value at index " + key);
        return this.array[key];
    }

    @Override
    public int hash(int key) {
        int index;
        index = key % capacity();
        return index;

    }

    public static void main(String[] args) {

        HashTable Table1 = new HashTable();

        for (int i = 0; i < 50; i++) {
            Table1.put(i);
        }
      
    }

}
