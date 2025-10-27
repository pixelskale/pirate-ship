import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner brother = new Scanner(System.in);
        System.out.print("Enter x and y : ");
        x = brother.nextInt(); y = brother.nextInt();
        System.out.println(power(x, y));
    }
    public static int power(int b, int p) {
        if (p != 0) { return b * power(b, p-1); }
        return 1;
    }
}
