import java.util.Random;

public class Mtx {
    private int[][] matrix;
    private int row;
    private int column;
    public Mtx(int[][] matrix) {
        this.matrix = matrix;
        this.row = matrix.length;
        this.column = matrix[0].length; // Assuming that said array is not jagged
    }
    public boolean equalSize(Mtx other) {
        if (this.row==other.row && this.column==other.column) { return true; }
        else { return false; }
    }
    public boolean compatible(Mtx other) {
        if (this.column==other.row) { return true; }
        else { return false; }
    }
    public Mtx add(Mtx other) {
        int[][] result = new int[this.row][this.column];
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Mtx(result);
    }
    public Mtx mul(Mtx other) {
        int[][] result = new int[this.row][other.column];
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                result[i][j] = 0;
                for (int k=0; k<this.column; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return new Mtx(result);
    }
    public Mtx mul(int n) {
        int[][] result = new int[this.row][this.column];
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                result[i][j] = this.matrix[i][j] * n;
            }
        }
        return new Mtx(result);
    }
    public int[][] getMatrix() {
        return this.matrix;
    }
    public void printMatrix() {
        for (int i=0; i<this.row; i++) {
            for (int j=0; j<this.column; j++) {
                if (j==this.column-1) { System.out.printf("%d", this.matrix[i][j]); }
                else { System.out.printf("%d ", this.matrix[i][j]); }
            }
            System.out.printf("%n");
        }
    }
    public static Mtx genMatrix(int row, int column, int origin, int bound) {
        int[][] result = new int[row][column];
        Random randy = new Random();
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                result[i][j] = randy.nextInt(origin, bound);
            }
        }
        return new Mtx(result);
    }
}
