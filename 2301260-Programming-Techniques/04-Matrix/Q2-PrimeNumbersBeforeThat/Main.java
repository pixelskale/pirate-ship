import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static boolean isPrime(int n) {
        if (n==0 || n==1) { return false; }
        for (int i=2; i<=n/2; i++) {
            if (n%i==0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner brother = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = brother.nextInt();
        brother.close();
        // Initialize ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Fill the ArrayList with prime numbers
        for (int i=0; i<n; i++) {
            if (isPrime(i)) { arrayList.add(i); }
        }
        // Print the contents of the ArrayList
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}
