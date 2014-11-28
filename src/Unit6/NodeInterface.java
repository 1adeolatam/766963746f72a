package Unit6;



/**
 * Lesson: 6.03 - a Node, in a Linked List
 */
public interface NodeInterface {
    
    /**
     * The node pointed to by 'next' is returned
     * @return 
     */
    public Node getNext();
    
    /**
     * The node pointed to by 'next' is changed to newNode
     * @param newNode
     */
    public void setNext( Node newNode );
    
    /**
     * The node pointed to by 'next' is returned.
     * @return 
     */
    public String getData(  );
}
