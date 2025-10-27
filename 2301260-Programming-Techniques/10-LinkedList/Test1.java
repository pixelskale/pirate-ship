public class Test1 {
    public static void main(String[] args) {
        // Creating a LinkedCollection object of integer type named ultimate.
        LinkedCollection<Integer> ultimate = new LinkedCollection<>();
        // Adding 20, 30 and 50 into the collection.
        ultimate.add(20);
        ultimate.add(30);
        ultimate.add(50);
        // Removing 20 from the collection.
        ultimate.remove(20);
        // Removing 50 from the collection.
        ultimate.remove(50);
        // Finding 30 in the collection.
        if (ultimate.contain(30)) { System.out.println("Integer 30 is found in the collection."); }
        else { System.out.println("Integer 30 is not found in the collection."); }
        // Displaying the size of the collection.
        System.out.println("Size of the collection: " + ultimate.size());
    }
}
