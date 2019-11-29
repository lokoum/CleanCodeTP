public class Node<T> {

    public Node<T> next;
    public int index;
    private T element;

    public Node(T element) {
        index = 0;
        next = null;
        this.element = element;
    }

    public Node() {
        index = -1;
        next = null;
    }

    public void setFinalNode(int index) {
        this.next = null;
        this.index = index;
    }

    public void setNode(Node<T> next, int index) {
        this.next = next;
        this.index = index;
    }

    public T getElement() {
        return element;
    }

    public void removeNextConnexion() {
        this.next = null;
    }

    public void setNewIndex(int newIndex) {
        this.index = newIndex;
    }
}
