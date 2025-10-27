public class BTNode<T> { // Assuming the exercise demands the use of Java generics.
    T data;
    BTNode<T> left;
    BTNode<T> right;
    public BTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
