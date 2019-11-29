import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddTest {

    @Test
    public void CreationNodeTest() {
        Node node = new Node("Vive BlackFriday");
        assertEquals(node.getElement(), "Vive BlackFriday");
        System.out.println("Création Node ok");
    }

    @Test
    public void AddNodeTest() {
        LinkedList<Node> nodes = new LinkedList<Node>();
        Node node = new Node("Vive BlackFriday");

        nodes.addNodeAtStartOfList(node);
        Node node2 = new Node("Tu as commandé quoi ?");
        nodes.addNodeAtEndOfList(node2);
        assertEquals(nodes.getFirstNode().getElement()., "Vive BlackFriday");
        //assertEquals(nodes.getLastNode().getElement(), "Vive BlackFriday");
        System.out.println("Ajout Node ok");
    }
}
