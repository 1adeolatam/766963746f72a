package Unit6;

/**
 * Lesson: 6.03 - a Node
 */
public class Node implements NodeInterface {

    private String data;
    private Node next;
    private Node prev;

    public Node(String newData) {
        this.data = newData;
        this.next = null;
        this.prev = null;
    }

    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public void setNext(Node newNode) {
        this.next = (newNode);
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public String getData() {
        return this.data;
    }

}
