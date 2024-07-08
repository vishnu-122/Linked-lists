class Node<T> {
    T value;
    Node<T> next;

    // Constructor to create a node with a given value and next node
    Node(T val, Node<T> n) {
        value = val;
        next = n;
    }

    // Constructor to create a node with a given value and no next node
    Node(T val) {
        this(val, null);
    }
}
