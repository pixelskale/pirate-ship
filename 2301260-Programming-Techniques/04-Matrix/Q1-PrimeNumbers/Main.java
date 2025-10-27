import java.util.Scanner;

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
        int prime = 0;
        // Assign n spaces to an array
        int[] array = new int[n];
        // Fill the array with prime numbers
        for (int i=0; i<n; i++) {
            while (true) {
                prime++;
                if (isPrime(prime)) {
                    array[i] = prime;
                    break;
                }
            }
        }
        // Print the contents of the array
        for (int i : array) {
            System.out.println(i);
        }
    }
}
