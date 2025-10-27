import java.lang.Math;

public class Sine extends Taylor {
    public Sine(int k, double x) {
        super(k, x);
    }
    @Override
    public double getApprox() {
        double result = 0;
        for (int n=0; n<=this.getIteration(); n++) {
            result += (Math.pow(-1, n)*(Math.pow(this.getValue(), (2*n)+1)))/this.factorial((2*n)+1);
        }
        return result;
    }
    @Override
    public void printValue() {
        System.out.println("Value from Math.sin() is " + Math.sin(this.getValue()));
        System.out.println("Approximated value is " + this.getApprox());
    }
}
