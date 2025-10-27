import java.awt.Point;
public abstract class Quadrilateral {
    private Point a, b, c, d;
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }
    public double[] getSortedDist() {
        double[] arr = {a.distance(b), a.distance(c), a.distance(d), b.distance(c), b.distance(d), c.distance(d)};
        // Bubble Sort Algorithm
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    @Override
    public String toString() {
        Point[] ultimate = {a, b, c, d};
        String result = "java.awt.Point[x=" + ultimate[0].x + ",y=" + ultimate[0].y + "]";
        for (int i=1; i<ultimate.length; i++) {
            result += "\njava.awt.Point[x=" + ultimate[i].x + ",y=" + ultimate[i].y + "]";
        }
        return result;
    }
    public abstract double area();
}
