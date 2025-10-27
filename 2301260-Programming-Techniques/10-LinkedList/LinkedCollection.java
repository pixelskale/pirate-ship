public class LinkedCollection<T> implements Collection<T> { // Assuming the exercise demands the use of Java generics.
    private MyNode<T> head;
    private int size;
    public LinkedCollection() {
        this.head = null;
        this.size = 0;
    }
    @Override
    public void add(T data) {
        MyNode<T> newNode = new MyNode<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    @Override
    public void remove(T data) {
        MyNode<T> current = head;
        MyNode<T> prev = null;
        while (current != null && !current.data.equals(data)) { // Dig deeper until data is found or the end is reached.
            prev = current; // Dig deeper!
            current = current.next; // Dig deeper!
        }
        if (current != null) { // If the end is not reached yet, meaning that the data is found.
            if (prev == null) { head = current.next; } // Happens to be the first node.
            else { prev.next = current.next; } // Happens to be any other node.
            size--; // Reduce size by 1
        }
    }
    @Override
    public boolean contain(T data) {
        MyNode<T> current = head;
        while (current != null) { // Dig deeper, if found then the collection contains the specified data.
            if (current.data.equals(data)) { return true; }
            current = current.next;
        } // If not found then the collection does not contain the specified data.
        return false;
    }
    @Override
    public boolean isEmpty() {
        return (head == null) || (size == 0);
    }
    @Override
    public int size() {
        return size;
    }
}
