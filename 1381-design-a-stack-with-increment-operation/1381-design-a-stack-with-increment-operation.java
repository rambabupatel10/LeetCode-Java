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
        if (head == null) {
            return;
        }

        int count = Math.min(k, size);
        Node[] arr = new Node[size];
        Node temp = head;

        for (int i = 0; i < size; i++) {
            arr[i] = temp;
            temp = temp.next;
        }
        for (int i = size - count; i < size; i++) {
            arr[i].data += val;
        }
    }
}