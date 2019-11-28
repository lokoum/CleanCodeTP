public class TestNode {
    int testInt;
    String testString;

    public TestNode(int testInt, String testString) {
        this.testInt = testInt;
        this.testString = testString;
    }

    @Override
    public String toString() {
        return "TestNode{" +
                "testInt=" + testInt +
                ", testString='" + testString + '\'' +
                '}';
    }
}
