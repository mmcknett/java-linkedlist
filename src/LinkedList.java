public class LinkedList {
    private Node head = null;

    public int length() {
        if (this.head == null) {
            return 0;
        }

        return 1;
    }

    public void add(int toAdd) {
        if (this.head == null) {
            this.head = new Node(toAdd);
        }
    }

    private static class Node {
        @SuppressWarnings("FieldMayBeFinal")
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
