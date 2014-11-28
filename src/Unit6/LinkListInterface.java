package Unit6;

/**
 * Lesson: 6.03 - Linked List
 */
public interface LinkListInterface {

    public int size();
    
    public void makeEmpty();
    
    /**
     * Adds a node to the front of the linked list .
     *
     * @param str
     */
    public void addAtFront( Node str );
    
    /**
     * Adds a node to the end of the linked list.
     *
     * @param str
     */
    public void addAtEnd( Node str );
    
    /**
     * Deletes a node in the linked list.
     *
     * @param str
     */
    public void remove(Node str );

    /**
     * Creates a string that lists the nodes of the linked list.
     *
     * @param str
     */
    public void toString( LinkedList str );

}
