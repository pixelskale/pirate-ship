public class MyNode<T> { // Assuming the exercise demands the use of Java generics.
    T data;
    MyNode<T> next;
    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }
}
