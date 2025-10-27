public class Rectangle extends Quadrilateral {
    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    public double area() {
        // According to the Pythagorean theorem, the square of the hypotenuse (the diagonal in this case)
        // is equal to the sum of the squares of the other two sides.
        // Therefore, the diagonal is always longer than either side of the rectangle.
        // This holds true for all rectangles, including squares.
        double[] ultimate = this.getSortedDist();
        return (ultimate[0] * ultimate[2]);
    }
}
