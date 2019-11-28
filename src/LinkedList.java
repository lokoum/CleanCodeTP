import java.util.List;

public class LinkedList<Object> {

    private List<Object> nodes;

    public List<Object> getNodes() {
        return nodes;
    }

    public LinkedList() {
    }

    public void addNodeAtEndOfList(Object node) {
        nodes.add(node);
    }

    public void addNodeAtStartOfList(Object node) {
        nodes.add(0, node);
    }

    public boolean addNodeAtIndex(Object node, int index) {
        if (isIndexInRange(index)) {
            nodes.add(index, node);
            return true;
        }
        return false;
    }

    public boolean deleteNodeAtIndex(int index) {
        if (isIndexInRange(index)) {
            return nodes.remove(index) != null;
        }
        return false;
    }

    public boolean deleteNode(Object node) {
        return nodes.remove(node);
    }

    public Object getNodeAtIndex(int index) {
        if (isIndexInRange(index)) {
            return nodes.get(index);
        }
        return null;
    }

    public int getIndexFromNode(Object node) {
        return nodes.indexOf(node);
    }

    public Object getFirstNode() {
        if (nodes.size() > 0) {
            return nodes.get(0);
        }
        return null;
    }

    public Object getLastNode() {
        if (nodes.size() > 0) {
            return nodes.get(getLastIndexFromList());
        }
        return null;
    }

    private int getLastIndexFromList() {
        return nodes.size() - 1;
    }

    private boolean isIndexInRange(int index) {
        return index > 0 && index < nodes.size();
    }
}
