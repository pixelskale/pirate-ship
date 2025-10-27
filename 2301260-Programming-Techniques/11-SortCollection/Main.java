public class Main {
    public static void main(String[] args) {
        // Creating a LinkedCollection object of integer type named ultimate.
        LinkedCollection<Integer> ultimate = new LinkedCollection<>();
        // 4.1) Adding 20, 30 into the collection.
        ultimate.add(20);
        ultimate.add(30);

        // 4.2) Adding 15, 25, 30, 40 into the collection.
        ultimate.add(15);
        ultimate.add(25);
        ultimate.add(30);
        ultimate.add(40);

        // 4.3) Finding 30 in the collection.
        System.out.println("Is 30 in the List?");
        System.out.println(ultimate.contain(30));
        ultimate.printList();

        // 4.4) Finding 28 in the collection.
        System.out.println("Is 28 in the List?");
        System.out.println(ultimate.contain(28));
        ultimate.printList();

        // 4.5) Removing 15, 25, 40 from the collection.
        ultimate.remove(15);
        ultimate.remove(25);
        ultimate.remove(40);

        // 4.6) Removing 35 from the collection.
        ultimate.remove(35);

        // Bonus) Displaying the size of the collection.
        System.out.println("Size of the collection: " + ultimate.size());
        ultimate.printList();
    }
}
