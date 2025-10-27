import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a1, a2, b1, b2, c1, c2, d1, d2, centroidX, centroidY, aD, bD, cD, dD;
        Scanner brother = new Scanner(System.in);
        System.out.print("First point : ");
        a1 = brother.nextDouble(); a2 = brother.nextDouble();
        System.out.print("Second point: ");
        b1 = brother.nextDouble(); b2 = brother.nextDouble();
        System.out.print("Third point : ");
        c1 = brother.nextDouble(); c2 = brother.nextDouble();
        System.out.print("Fourth point: ");
        d1 = brother.nextDouble(); d2 = brother.nextDouble();
        centroidX = (a1 + b1 + c1 + d1)/4;
        centroidY = (a2 + b2 + c2 + d2)/4;
        aD = Math.hypot(centroidX-a1, centroidY-a2);
        bD = Math.hypot(centroidX-b1, centroidY-b2);
        cD = Math.hypot(centroidX-c1, centroidY-c2);
        dD = Math.hypot(centroidX-d1, centroidY-d2);
        System.out.println("The centroid is ( " + centroidX + ", " + centroidY + " ).");
        System.out.println("Sum of distance is " + (aD + bD + cD + dD) + ".");
        System.out.println("Shortest distance is " + Math.min(Math.min(Math.min(aD, bD), cD), dD) + ".");
        System.out.println("Longest distance is " + Math.max(Math.max(Math.max(aD, bD), cD), dD) + ".");
    }
}
