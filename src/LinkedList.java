import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<Object> {

    private List<Object> nodes;

    public LinkedList() {
        nodes = new List<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(java.lang.Object o) {
                return false;
            }

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public java.lang.Object[] toArray() {
                return new java.lang.Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Object object) {
                return false;
            }

            @Override
            public boolean remove(java.lang.Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Object> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Object> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(java.lang.Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(java.lang.Object o) {
                return 0;
            }

            @Override
            public ListIterator<Object> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Object> listIterator(int index) {
                return null;
            }

            @Override
            public List<Object> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

    public List<Object> getNodes() {
        return nodes;
    }

    public int getSize() {
        return nodes.size();
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
