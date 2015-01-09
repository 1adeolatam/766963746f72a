/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

import edu.hdsb.gwss.muir.ics4u.u6.HashTableInterface;

/**
 *
 * @author 1adeolatam
 */
public class HashTable implements HashTableInterface {

    public LinkedList[] array;

    public HashTable(int expectedSize) {
        this.array = new LinkedList[nextPrime(expectedSize)];
        this.makeEmpty();
        System.out.println("There are " + size() + " elemenets in this table.");
    }

    @Override
    public void resize() {
        // Makes the expected amount of elements at 25% 75 / 3 = 25.
        LinkedList[] oldArray = this.array;

        this.array = new LinkedList[nextPrime(capacity())];
        makeEmpty();

        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] >= 0) {
                put(oldArray[i]);
            }
        }

        System.out.println("NEW array size = " + this.array.length);

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
        double lf;
        lf = (double) this.size() / (double) this.capacity() * 100.0;
        return lf;
    }

    // Stack overflow http://stackoverflow.com/questions/22082770/next-prime-number-java-only-working-with-certain-numbers
    public int nextPrime(int capacity) {
        int newcapacity = capacity * 3;
        boolean isPrime = false;
        int m = (int) Math.ceil(Math.sqrt(capacity));
        int start = 3;
        newcapacity++;
        if (newcapacity % 2 == 0) {
            newcapacity = newcapacity + 1;
        }
        while (!isPrime) {
            isPrime = true;
            for (int i = start; i <= m; i = i + 2) {
                if (newcapacity % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                newcapacity = newcapacity + 2;
            }
        }

        return newcapacity;
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

        System.out.format("%24s", "\nLoad Factor before adding ");
        System.out.format("%2.3f", loadFactor());
        System.out.print("%\n");
        int index = hash(value);
        int collisions = 0;
        boolean inserted = false;

        do {
            if (this.array[index] == -1) {
                this.array[index] = value;
                inserted = true;

            } else {
                collisions++;
                index++;
                if (index == this.array.length) {
                    index = index % this.array.length;
                }
            }
        } while (!inserted);

        System.out.println("Value " + value + " has been added at index " + index + " # Collisions: " + collisions);

        if (loadFactor() >= 75.0) {
            resize();
        }

    }

    @Override
    public boolean containsKey(int key) {

        int i = hash(key);
        boolean exists = false;

        do {
            if (this.array[i] == key) {
                exists = true;
            } else {
                i = (i + 1) % capacity();
           
                        
            }
        } while (!exists && i == -1);
        
        if(exists){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int get(int key) {
        int i = hash(key);
        boolean exists = false;

        do {
            if (this.array[i] == key) {
                exists = true;
            } else {
                i = (i + 1) % capacity();
           
                        
            }
        } while (!exists && i == -1);
        
        if(exists){
            return this.array[i];
        }else{
            return 0;
        }
        
  
    }

    @Override
    public int hash(int key) {
        return key % capacity();

    }

    public static void main(String[] args) {
// 50 is the expected size, inputed in the contstructor of the hash table
        HashTable Table1 = new HashTable(50);

        for (int i = 0; i < 1000; i++) {
            // The array resizes when the laod factor hits 75% and causes it to drop to 25% (multiply current cap. by 3
            Table1.put((int) (Math.random() * 10000));

        }
        System.out.println("Is  the table is empty: " + Table1.isEmpty());

        int randValue = (int) (Math.random() * 1000);
        System.out.println("Getting value at index " + Table1.get(randValue));

        System.out.println("Checking to see if a value exists in the hash table.");
        System.out.println("Does the value " + randValue + " exist in the hash table " + Table1.containsKey(randValue));

        System.out.println("Current hash table size");
        System.out.println(Table1.size());
        System.out.println("Current hash table capacity");
        System.out.println(Table1.capacity());

        System.out.println(" Make the table empty then check to see if is Empty works");
        Table1.makeEmpty();
        System.out.println("Is  the table  empty: " + Table1.isEmpty());

    }

}
