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

    public HashTable(int expectedSize) {
        this.array = new int[nextPrime(expectedSize)];
        this.makeEmpty();
        System.out.println("There are " + size() + " elemenets in this table.");
    }

    @Override
    public void resize() {
        // Makes the expected amount of elements at 25% 75 / 3 = 25.
        int[] nextarray = new int[nextPrime(capacity())];
        for (int i = 0; i < nextarray.length; i++) {
            nextarray[i] = -1;
        }

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] > -1) {
                nextarray[i] = hash(this.array[i]);
            }
        }
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
        lf = (double) this.size() / (double) this.capacity() * 100.0;
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

        System.out.format("%24s","\nLoad Factor before adding " );
        System.out.format("%2.3f", loadFactor());
        System.out.print("%\n");
        int index = hash(value);
        int collisions = 0;
        boolean inserted = false;
        do {
            if (array[index] == -1) {
                array[index] = value;
                inserted = true;
            } else {
                collisions++;
                index++;
                if (index == array.length) {
                    index = index % array.length;
                }
            }
        } while (!inserted);

        System.out.println("Value " + value + " has been added at index " + index + " # Collisions: " + collisions);

        if (loadFactor() > 75.0) {
            resize();
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

        // 50 is the expected size, inputed in the contstructor of the hash table
        HashTable Table1 = new HashTable(50);

        for (int i = 0; i < 1000; i++) {
            // The array resizes when the laod factor hits 75% and causes it to drop to 25% (multiply current cap. by 3
            Table1.put((int) (Math.random() * 10000));

        }
        System.out.println("Is  the table is empty: " + Table1.isEmpty());

        System.out.println(" Make the table empty then check to see if is Empty works");
        Table1.makeEmpty();
        System.out.println("Is  the table is empty: " + Table1.isEmpty());

    }

}
