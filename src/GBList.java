public interface GBList<T> {
    void add(T item);
    void remove(T item);
    boolean contains(T item);
    int size();
    boolean isEmpty();
}

