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

    public static void main(String[] args) {

        HashTable LeonsTable = new HashTable();

        System.out.println(LeonsTable.capacity());

    }

    public HashTable() {
        this.array = new int[nextPrime(50)];
    }

    @Override
    public void resize() {
        if (loadFactor() >= .75) {
            int[] nextarray = new int[nextPrime(capacity())];

            for (int i = 0; i < this.array.length; i++) {
                nextarray[i] = this.array[i];
            }
        }

    }

    @Override
    public int size() {
        int totalCounted = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] > -1) {
                totalCounted++;
            }

        }

        return totalCounted;
    }

    @Override
    public double loadFactor() {
        return this.size() / this.capacity();
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

    }

    @Override
    public void isEmpty() {

    }

    @Override
    public void put(int value) {

    }

    @Override
    public void containsKey(int key) {
    }

    @Override
    public int get(int key) {

    }

    @Override
    public int hash(int key) {
        int index;
        index = key % capacity();
        return index;

    }

}
