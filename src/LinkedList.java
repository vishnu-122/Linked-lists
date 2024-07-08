public class LinkedList<T> {
    private Node<T> first; // list head
    private Node<T> last;  // list end
    private int count;     // number of elements in the list

    /** Constructor */
    public LinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    /** Returns the size of the list */
    public int size() {
        return count;
    }

    /** Checks if the list is empty */
    public boolean isEmpty() {
        return count == 0;
    }

    /** Adds an element to the end of the list */
    public void add(T element) {
        if (isEmpty()) {
            first = new Node<>(element, null);
            last = first;
        } else {
            last.next = new Node<>(element, null);
            last = last.next;
        }
        count++;
    }

    /** Searches the list for a specified item */
    public boolean contains(T item) {
        Node<T> current = first;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /** Prints the elements of the list */
    public void printList() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
