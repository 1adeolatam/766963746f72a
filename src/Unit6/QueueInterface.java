package Unit6;

/**
 * Lesson: 6.01 - Queue
 */
public interface QueueInterface {
    
    public int enqueue();

    public int dequeue();

    public int size();

    public boolean isEmpty();
    
    public boolean isFull();

    public void makeEmpty();

}
