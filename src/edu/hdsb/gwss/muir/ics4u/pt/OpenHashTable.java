package edu.hdsb.gwss.muir.ics4u.pt;

/**
 * Open Hash Table
 *
 *
 * @version v2014.S1
 */
public class OpenHashTable {

    /**
     * Open Hash Table: an array of Linked Lists
     */
    private LinkedListPT[] array;

    /**
     * Creates an Open Hash Table; default size 11
     */
    public OpenHashTable() {
        this(11);
    }

    /**
     * Creates an Open Hash Table
     *
     * @param intialSize the initial capacity, rounded to the next prime.
     */
    public OpenHashTable(int intialSize) {
        array = new LinkedListPT[nextPrime(intialSize)];
        makeEmpty();
    }

    /**
     * Make that hash table empty.
     */
    public void makeEmpty() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = new LinkedListPT();
        }
    }

    /**
     * This method returns true if there are no student objects in the hash
     * table.
     *
     * @return true if the hash table contains no student objects.
     */
    public boolean isEmpty() {

        return size() == 0;
    }

    /**
     * Gets the student object given the key (student number). This method does
     * NOT remove the object.
     *
     * @param key
     * @return student object for the given key (student number)
     */
    public CSStudent get(int key) {
        int i = hash(key);

        return this.array[i].get(key);

    }

    /**
     * Puts a student in the Hash Table. Duplicates are fine, and assume student
     * objects are correct and have unique keys.
     *
     * @param student valid student object
     */
    public void put(CSStudent student) {

        int index = hash(student.getKey());
        this.array[index].addAtEnd(student);

    }

    /**
     * Determines if a student object exists with the given key (student number)
     *
     * @param key key (student number)
     * @return returns true if the student with the given key (student number)
     * exists
     */
    public boolean containsKey(int key) {

        int i = hash(key);
        boolean exists = false;

        do {
            if (this.array[i].get(hash(key)).getKey() == key) {
                exists = true;
            } else {
                i = (i + 1) % capacity();

            }
        } while (!exists && this.array[i] == null);

        if (exists) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The number of student objects in the hash table.
     *
     * @return the number of student objects in the hash table.
     */
    public int size() {
        int totalCounted = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].size() > 0) {
                totalCounted = totalCounted + this.array[i].size();
            }
        }

        return totalCounted;
    }

    /**
     * The capacity of the Open Hash Table; THINK! THINK! THINK!
     *
     * @return
     */
    public int capacity() {
        //The capacity the number of each student in each linked list(potentially infinite) multiplied by the number of linked lists in the has tablnextprime(11).
        return 2121212121;
    }

    /**
     * COMPLETE!
     *
     * @return returns a graphic of the Open Hash Table
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                s = s + "\n" + "HT[" + i + "] " + this.array[i].toString();
            } else {
                s = s + "\n" + "HT[" + i + "] EMPTY";
            }
        }
        return s;
    }

    /**
     * Hash Function; COMPLETE
     *
     * @param key key (student number)
     * @return hash value
     */
    public int hash(int key) {
        return key % this.array.length;
    }

    /**
     * COMPLETE
     */
    public static int nextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        };
        return n;
    }

    /**
     * COMPLETE
     */
    private static boolean isPrime(long n) {
        // EVEN TEST
        if (n > 2 && (n & 1) == 0) {
            return false;
        }
        // ODD FACTORS
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
