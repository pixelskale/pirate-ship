public class LinkedCollection<T extends Comparable<T>> implements SortCollection<T> { // Assuming the exercise demands the use of Java generics.
    private MyNode<T> head;
    private int size;
    public LinkedCollection() {
        this.head = null;
        this.size = 0;
    }
    @Override
    public void add(T data) {
        if (contain(data)) {
            System.out.println(data + " has already existed in List");
            printList();
            return; // Ignore the insertion.
        }
        int count = 0;
        MyNode<T> newNode = new MyNode<T>(data);
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null && current.next.data.compareTo(data) < 0) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
            count++;
        }
        size++;
        System.out.println("Add Value: " + data);
        System.out.println("count = " + count);
        printList();
    }
    @Override
    public void remove(T data) {
        int count = 0;
        MyNode<T> current = head;
        MyNode<T> prev = null;
        while (current != null && current.data.compareTo(data) < 0) {
            prev = current; // Dig deeper!
            current = current.next; // Dig deeper!
            count++; // Increment count by 1
        }
        if (current != null && current.data.equals(data)) { // If the end is not reached yet and found said data.
            if (prev == null) { head = current.next; } // Happens to be the first node.
            else { prev.next = current.next; } // Happens to be any other node.
            size--; // Reduce size by 1
            System.out.println("Remove Value: " + data);
            System.out.println("count = " + count);
            printList();
        } else {
            System.out.println(data + " not found in List");
            System.out.println("count = " + count);
            printList();
        }
    }
    @Override
    public boolean contain(T data) {
        MyNode<T> current = head;
        while (current != null && current.data.compareTo(data) <= 0) {
            if (current.data.equals(data)) { return true; }
            current = current.next;
        }
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
    public void printList() {
        MyNode<T> current = head;
        System.out.print("PRINTLIST:");
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
        System.out.printf("%n");
        System.out.println("------------------------------------------------");
    }
}
