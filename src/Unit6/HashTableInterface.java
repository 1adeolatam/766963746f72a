package Unit6;

/**
 * Lesson: 6.04 - (Closed) Hash Table
 */
public interface HashTableInterface {

    public int size();

    public void resize();

    public int capacity();

    public double loadFactor();

    public void makeEmpty();

    public void isEmpty();

    public int get( int key );

    public void put( int value );

    public void containsKey( int key );

    public int hash( int key );

}
