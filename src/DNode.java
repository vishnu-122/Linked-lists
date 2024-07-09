public class DNode<T> {
    T value;
    DNode<T> next;
    DNode<T> previous;

    DNode(T val,DNode<T> n, DNode<T> p){
        value = val;
        next = n;
        previous = p;
    }

    DNode(T val){
        this(val,null,null);
    }
}
