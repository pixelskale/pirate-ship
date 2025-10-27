import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a1, a2, b1, b2, m1, m2;
        Scanner brother = new Scanner(System.in);
        System.out.print("Point A: ");
        a1 = brother.nextDouble(); a2 = brother.nextDouble();
        System.out.print("Point B: ");
        b1 = brother.nextDouble(); b2 = brother.nextDouble();

        // Create an object in class Point
        Point a = new Point(a1, a2);
        Point b = new Point(b1, b2);

        // Print the first result
        System.out.println("A = " + a.toString() + " B = " + b.toString() + " Distance = " + a.distance(b));

        // Translate the points
        System.out.print("Move the points: ");
        m1 = brother.nextDouble(); m2 = brother.nextDouble();
        a.translate(m1, m2);
        b.translate(m1, m2);

        // Print the second result
        System.out.println("A = " + a.toString() + " B = " + b.toString() + " Distance = " + a.distance(b));

        // Print the equals method
        // I don't know whether the equals method should be static or not according to the instructions
        boolean gameshow = Boolean.logicalAnd(Point.equals(a, b), a.equals(b));
        if (gameshow) {
            System.out.print("A and B are at the same position.");
        }
        else {
            System.out.print("A and B are not at the same position.");
        }
    }
}
