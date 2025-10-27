public abstract class Taylor {
    private int k;
    private double x;
    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }
    public int factorial(int n) {
        int result = 1;
        for (int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }
    public int getIteration() {
        return k;
    }
    public double getValue() {
        return x;
    }
    public abstract double getApprox();
    public abstract void printValue();
}
