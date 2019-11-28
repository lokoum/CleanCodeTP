public class Main {

    public static void main(String[] args) {
        TestNode node = new TestNode(2, "Coucou c'est un test");
        LinkedList<TestNode> nodes = new LinkedList<TestNode>();

        nodes.addNodeAtStartOfList(node);
        node.testString = "First changed";
        node.testInt = 1;

        nodes.addNodeAtEndOfList(node);

        node.testString = "Back to first";
        node.testInt = 0;

        nodes.addNodeAtStartOfList(node);

        TestNode nodeAtIndex = new TestNode(10, "I'm a node and I want to be at a specific index");


        if (nodes.addNodeAtIndex(nodeAtIndex, 1)) {
            System.out.println("It works");
        }

        if (!nodes.addNodeAtIndex(nodeAtIndex, 10)) {
            System.out.println("It doesn't works");
        }


        for (int i = 0; i < nodes.getSize(); i++) {
            if (nodes.getNodeAtIndex(i) != null)
                System.out.println(nodes.getNodeAtIndex(i).getElement().toString());
            else
                System.out.println("Null");
        }
    }

}
