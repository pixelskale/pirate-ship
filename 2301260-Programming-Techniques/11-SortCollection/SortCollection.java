public interface SortCollection<T> { // Assuming the exercise demands the use of Java generics.
    void add(T data); // Add objects of type T (generic type).
    void remove(T data); // Remove objects of type T (generic type).
    boolean contain(T data); // Check if the collection contains any objects of type T (generic type).
    boolean isEmpty(); // Check if the collection is empty.
    int size(); // Return the size of the collection.
}
