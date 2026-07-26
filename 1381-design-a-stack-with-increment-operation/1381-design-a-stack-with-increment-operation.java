class CustomStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head;
    int size;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.head = null;
    }

    public void push(int x) {
        if (size == maxSize) {
            return;
        }

        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

   public void increment(int k, int val) {
    int count = Math.min(k, size);
    int skip = size - count;

    Node temp = head;

    while (skip-- > 0) {
        temp = temp.next;
    }

    while (temp != null) {
        temp.data += val;
        temp = temp.next;
    }
}
}