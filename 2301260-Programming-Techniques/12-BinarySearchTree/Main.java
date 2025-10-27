public class Main {
    public static void main(String[] args) {
        // Creating a BinarySearchTree object of integer type named ultimate.
        BinarySearchTree<Integer> ultimate = new BinarySearchTree<>();
        // 3.1) Adding 9, 2, 12, 1, 5, 10, 15 into the tree.
        ultimate.add(9);
        ultimate.add(2);
        ultimate.add(12);
        ultimate.add(1);
        ultimate.add(5);
        ultimate.add(10);
        ultimate.add(15);
        ultimate.printTree();
        // 3.2) Displaying the amount of nodes in the tree (nnodes).
        System.out.println("nnodes: " + ultimate.nnodes());
        // 3.3) Displaying the minimum and maximum value of all the nodes in the tree.
        System.out.println("Min: " + ultimate.getMin());
        System.out.println("Max: " + ultimate.getMax());
        // 3.4) Finding 12 in the tree.
        System.out.print("Is 12 in the Tree?  ");
        System.out.println(ultimate.contain(12));
        // 3.5) Finding 20 in the tree.
        System.out.print("Is 20 in the Tree?  ");
        System.out.println(ultimate.contain(20));
        // 3.6) Removing 5 from the tree.
        ultimate.remove(5);
        ultimate.printTree();
    }
}
