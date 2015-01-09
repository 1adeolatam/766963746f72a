package edu.hdsb.gwss.muir.ics4u.pt;

/**
 * Linked List Node: COMPLETE!
 *
 * @version v2014.S1
 */
public class NodePT {

    private CSStudent data;
    private NodePT next;
    private NodePT prev;
    /**
     * Node
     *
     * @param newData student object
     */
    public NodePT( CSStudent newData ) {
        this.data = newData;
        this.next = null;
    }

    /**
     * Gets the next node
     *
     * @return the next node, or NULL if there is no next node.
     */
    public NodePT getNext() {
        return this.next;
    }

    /**
     * Sets the next node
     *
     * @param nextNode sets the next node
     */
    public void setNext( NodePT nextNode ) {
        this.next = nextNode;
    }

    /**
     * Gets the student object from the node.
     *
     * @return the student object of the node
     */
    public CSStudent getData() {
        return this.data;
    }

    public NodePT getPrev() {
        return prev;
    }

    public void setPrev(NodePT prev) {
        this.prev = prev;
    }

}
