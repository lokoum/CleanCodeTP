import javafx.beans.binding.ObjectExpression;

import java.util.*;

public class LinkedList<T> {

    private Node<T> head = null;
    private int numberOfElements;

    public LinkedList() {
        numberOfElements = 0;
        head = new Node<T>();
        head.next = null;
    }

    public int getSize() {
        return numberOfElements;
    }

    public void addNodeAtEndOfList(T element) {
        Node<T> newNode = new Node<T>(element);
        if (isListEmpty()) {
            addNodeOnEmptyList(newNode);
            return;
        }
        Node<T> temp = head.next;
        int index = 0;
        while (temp.next != null) {
            temp = temp.next;
            index++;
        }
        newNode.setFinalNode(index + 1);
        temp.setNode(newNode, index);
        increaseNumberOfElements();
    }

    public void increaseNumberOfElements() {
        numberOfElements++;
    }

    public void decreaseNumberOfElements() {
        numberOfElements--;
    }

    public void addNodeAtStartOfList(T element) {
        Node<T> newNode = new Node<T>(element);
        if (isListEmpty()) {
            addNodeOnEmptyList(newNode);
            return;
        }
        newNode.setNode(head.next, 0);
        head.setNode(newNode, -1);
        increaseNumberOfElements();
    }

    private void addNodeOnEmptyList(Node<T> node) {
        node.setFinalNode(0);
        head.setNode(node, -1);
        increaseNumberOfElements();
    }

    public boolean addAtFirstIndex(T element, int index) {
        if (isListEmpty()) {
            if (index == 0)
            {
                addNodeAtStartOfList(element);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean addNodeAtIndex(T element, int index) {
        if (addAtFirstIndex(element, index)) {
            return true;
        }
        if (!isIndexInRange(index)) {
            System.out.println("Danger");
            return false;
        }
        Node<T> nodeAtIndex = getNodeAtIndex(index);
        Node<T> nodeBeforeIndex = getNodeAtIndex(index - 1);
        Node<T> newNode = new Node<T>(element);
        newNode.setNode(nodeAtIndex, index);
        nodeBeforeIndex.setNode(newNode, index - 1);
        increaseNumberOfElements();
        return true;
    }

    public boolean deleteNodeAtIndex(int index) {
        if (isListEmpty())
            return false;
        if (!isIndexInRange(index))
            return false;
        if (index == 1) {
            head.removeNextConnexion();
            decreaseNumberOfElements();
            return true;
        }
        Node<T> nodeBeforeDeletedOne = getNodeAtIndex(index - 1);
        nodeBeforeDeletedOne.removeNextConnexion();
        decreaseNumberOfElements();
        return true;
    }

    public boolean deleteNode(T element) {
        int index = getIndexFromNode(element);
        if (index != -1) {
            if (isIndexInRange(index)) {
                deleteNodeAtIndex(index);
                return true;
            }
        }
        return false;
    }

    public Node<T> getNodeAtIndex(int index) {
        Node<T> temp = head.next;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }
        return temp;
    }

    public int getIndexFromNode(T element) {
        Node<T> temp = head.next;
        int i = 0;
        while (temp != null) {
            if (temp.getElement() == element)
                return i;
            temp = temp.next;
        }
        return -1;
    }

    public Node<T> getFirstNode() {
        if (isListEmpty())
            return null;
        return head.next;
    }

    public Node<T> getLastNode() {
        if (isListEmpty())
            return null;
        Node<T> temp = head;
        int i = 0;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    private boolean isListEmpty() {
        return head.next == null;
    }

    private boolean isIndexInRange(int index) {
        Node<T> temp = head.next;
        for (int i = 0; i <= index; i++) {
            if (temp == null)
                return false;
            temp = temp.next;
        }
        return true;
    }
}
