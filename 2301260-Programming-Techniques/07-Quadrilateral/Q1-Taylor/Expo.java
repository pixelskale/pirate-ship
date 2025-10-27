import java.lang.Math;

public class Expo extends Taylor {
    public Expo(int k, double x) {
        super(k, x);
    }
    @Override
    public double getApprox() {
        double result = 0;
        for (int n=0; n<=this.getIteration(); n++) {
            result += (Math.pow(this.getValue(), n))/this.factorial(n);
        }
        return result;
    }
    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is " + Math.exp(this.getValue()));
        System.out.println("Approximated value is " + this.getApprox());
    }
}
