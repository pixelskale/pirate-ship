import java.util.Random;

public class Main {
    public static int[][] genArray(int row, int column, int origin, int bound) {
        int[][] result = new int[row][column];
        Random randy = new Random();
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                result[i][j] = randy.nextInt(origin, bound);
            }
        }
        return result;
    }
    public static void newLine() { System.out.printf("%n"); }

    public static void main(String[] args) {
        int[][] a = genArray(10, 5, -100, 100);
        int[][] b = genArray(10, 5, -100, 100);
        int[][] c = genArray(5, 3, -100, 100);
        Mtx A = new Mtx(a); Mtx B = new Mtx(b); Mtx C = new Mtx(c);
        System.out.println("A =");
        A.printMatrix(); newLine();
        System.out.println("B =");
        B.printMatrix(); newLine();
        System.out.println("C =");
        C.printMatrix(); newLine();

        // A + B
        if (!A.equalSize(B)) { System.out.println("A and B are not compatible"); newLine(); }
        else {
            Mtx ApB = A.add(B);
            System.out.println("A+B =");
            ApB.printMatrix(); newLine();
        }

        // 2 * B
        Mtx Bm2 = B.mul(2);
        System.out.println("2*B =");
        Bm2.printMatrix(); newLine();

        // A * B
        if (!A.compatible(B)) { System.out.println("A and B are not compatible"); newLine(); }
        else {
            Mtx AmB = A.mul(B);
            System.out.println("A*B =");
            AmB.printMatrix(); newLine();
        }

        // A * C
        if (!A.compatible(C)) { System.out.println("A and C are not compatible"); newLine(); }
        else {
            Mtx AmC = A.mul(C);
            System.out.println("A*C =");
            AmC.printMatrix();
        }
    }
}
