import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n; boolean first = true;
        Scanner brother = new Scanner(System.in);
        System.out.print("Enter a positive integer : "); n = brother.nextInt();
        System.out.print("Prime factors of " + n + " are ");
        for (int f : primeFactor(n)) {
            if (!first) { System.out.print("," + f); }
            else {
                System.out.print(f);
                first = false;
            }
        }
        System.out.println(".");
    }
    public static int factorAll(int n, int f) {
        if (n%f == 0) {
            return factorAll(n/f, f);
        }
        return n;
    }
    public static boolean isPrime(int n) {
        if (n==0 || n==1) { return false; }
        for (int i=2; i<=n/2; i++) {
            if (n%i==0) { return false; }
        }
        return true;
    }
    public static ArrayList<Integer> primeFactor(int n) {
        return primeFactor(new ArrayList<Integer>(), n, 2);
    }
    public static ArrayList<Integer> primeFactor(ArrayList<Integer> factors, int n, int f) {
        if (f <= n) { // in bounds
            if (n%f==0) { // factor found, factor all of it out.
                n = factorAll(n, f);
                if (isPrime(f)) { // factor found is prime, add it to the list.
                    factors.add(f);
                }
            }
            else { // factor not found, increment by 1.
                f++;
            }
            return primeFactor(factors, n, f);
        }
        return factors;
    }
}
