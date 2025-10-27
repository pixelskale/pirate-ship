public class Point {
    private double x;
    private double y;
    // Point Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Euclidean Distance
    public double distance(Point other) {
        return Math.hypot(this.x-other.x, this.y-other.y);
    }
    // Translate Point
    public void translate(double x, double y) {
        this.x = this.x+x;
        this.y = this.y+y;
    }
    // STATIC Equals
    public static boolean equals(Point first, Point second) {
        return Boolean.logicalAnd((first.x==second.x), (first.y==second.y));
    }
    // NON-STATIC Equals
    public boolean equals(Point other) {
        return Boolean.logicalAnd((this.x==other.x), (this.y==other.y));
    }
    // To String
    public String toString() {
        String result = new String();
        result = "(" + this.x + "," + this.y + ")";
        return result;
    }
}
