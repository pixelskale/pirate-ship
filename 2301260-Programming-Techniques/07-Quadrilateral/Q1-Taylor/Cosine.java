import java.lang.Math;

public class Cosine extends Taylor {
    public Cosine(int k, double x) {
        super(k, x);
    }
    @Override
    public double getApprox() {
        double result = 0;
        for (int n=0; n<=this.getIteration(); n++) {
            result += (Math.pow(-1, n)*(Math.pow(this.getValue(), (2*n))))/this.factorial((2*n));
        }
        return result;
    }
    @Override
    public void printValue() {
        System.out.println("Value from Math.cos() is " + Math.cos(this.getValue()));
        System.out.println("Approximated value is " + this.getApprox());
    }
}
