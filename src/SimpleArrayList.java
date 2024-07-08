public class SimpleArrayList<T> {
    private final int DEFAULT_CAPACITY = 10;
    private final int RESIZE_FACTOR = 2;
    private Object[] list;
    private int size;

    public SimpleArrayList() {
        list = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T newItem) {
        if (size < list.length) {
            list[size++] = newItem;
        } else {
            Object[] newList = new Object[list.length * RESIZE_FACTOR];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            newList[size++] = newItem;
            list = newList;
        }
    }

    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if (((T) (list[i])).equals(item)) {
                return true;
            }
        }
        return false;
    }
}

