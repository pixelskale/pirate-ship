public class BinarySearchTree<T extends Comparable<T>> { // Assuming the exercise demands the use of Java generics.
    // NOTE : In this class, I've utilized the following convention.
    // A variable named laser is the explorer of the current method.
    // A variable named diode is the parent of the explorer (laser) of the current method.
    // A variable named monster is the parent of the diode (Oh look! MONSTER!!!!).
    private BTNode<T> root;
    public BinarySearchTree() {
        this.root = null;
    }
    public void add(T data) {
        if (root == null) { root = new BTNode<T>(data); return;}
        boolean goRight = false;
        BTNode<T> diode = root;
        BTNode<T> laser = root;
        while (laser != null) {
            diode = laser;
            if (data.compareTo(laser.data) < 0) {
                goRight = false;
                laser = laser.left;
            }
            else if (data.compareTo(laser.data) > 0) {
                goRight = true;
                laser = laser.right;
            }
            else { return; }
        }
        if (!goRight) { diode.left = new BTNode<T>(data); }
        else { diode.right = new BTNode<T>(data); }
    }
    public boolean contain(T data) {
        BTNode<T> laser = root;
        while (laser != null) {
            if (data.compareTo(laser.data) < 0) {
                laser = laser.left;
            }
            else if (data.compareTo(laser.data) > 0) {
                laser = laser.right;
            }
            else { return true; }
        }
        return false;
    }
    public T getMin() {
        if (root == null) { return null; }
        BTNode<T> diode = root;
        BTNode<T> laser = root;
        while (laser != null) {
            diode = laser;
            laser = laser.left;
        }
        return diode.data;
    }
    public T getMax() {
        if (root == null) { return null; }
        BTNode<T> diode = root;
        BTNode<T> laser = root;
        while (laser != null) {
            diode = laser;
            laser = laser.right;
        }
        return diode.data;
    }
    public void remove(T data) {
        if (root == null) { return; } // Tree is empty
        BTNode<T> diode = null; // Parent of the node to be removed
        BTNode<T> laser = root; // Node to be removed
        boolean goRight = false; // Flag to track the direction of traversal
        // Find the node to remove
        while (laser != null && !data.equals(laser.data)) {
            diode = laser;
            if (data.compareTo(laser.data) < 0) {
                goRight = false;
                laser = laser.left;
            } else {
                goRight = true;
                laser = laser.right;
            }
        }
        if (laser == null) { return; } // Node not found

        // Case 0: 0 Children
        if (laser.left == null && laser.right == null) {
            if (diode == null) { root = null; } // Removing the root node
            else if (!goRight) { diode.left = null; } // Removing left child
            else { diode.right = null; } // Removing right child
        }
        // Case 1: 1 Children
        else if (laser.right == null) {
            if (diode == null) { root = laser.left; } // Removing root with left child
            else if (!goRight) { diode.left = laser.left; } // Left child
            else { diode.right = laser.left; } // Right child
        }
        else if (laser.left == null) {
            if (diode == null) { root = laser.right; } // Removing root with right child
            else if (!goRight) { diode.left = laser.right; } // Left child
            else { diode.right = laser.right; } // Right child
        }
        // Case 2: 2 Children
        else {
            BTNode<T> successor = getSuccessor(laser); // Find the successor node
            if (diode == null) { root = successor; } // Root with two children
            else if (!goRight) { diode.left = successor; } // Left child
            else { diode.right = successor; } // Right child
            successor.left = laser.left; // Update left subtree
        }
    }
    // Helper method to find the successor node (minimum value in the right subtree).
    private BTNode<T> getSuccessor(BTNode<T> node) {
        BTNode<T> monster = node;
        BTNode<T> diode = node;
        BTNode<T> laser = node.right; // Go to the right child
        while (laser != null) { // Go to the left most node
            monster = diode;
            diode = laser;
            laser = laser.left;
        }
        // If the successor is not a right child
        if (diode != node.right) {
            monster.left = diode.right;
            diode.right = node.right;
        }
        return diode;
    }
    // Helper method to find the predecessor node (maximum value in the left subtree).
    private BTNode<T> getPredecessor(BTNode<T> node) {
        BTNode<T> monster = node;
        BTNode<T> diode = node;
        BTNode<T> laser = node.left; // Go to the left child
        while (laser != null && laser.right != null) { // Go to the right most node
            monster = diode;
            diode = laser;
            laser = laser.right;
        }
        // If the predecessor is not a left child
        if (diode != node.left) {
            monster.right = diode.left;
            diode.left = node.left;
        }
        return diode;
    }
    public int nnodes() { return nnodes(root); } // Call Helper
    private int nnodes(BTNode<T> node) {
        if (node == null) { return 0; } // Base Case
        else { return nnodes(node.left) + nnodes(node.right) + 1; }
    }
    public void printTree() { // Call Helper
        System.out.println("Inorder");
        printTree(root); System.out.println();
    }
    private void printTree(BTNode<T> node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.data + " ");
            printTree(node.right);
        }
    }
}
