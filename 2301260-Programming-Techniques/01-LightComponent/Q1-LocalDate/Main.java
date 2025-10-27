import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);
        Scanner Brother = new Scanner(System.in);
        int day, month, year;
        System.out.print("Enter day: ");
        day = Brother.nextInt();
        System.out.print("Enter month: ");
        month = Brother.nextInt();
        System.out.print("Enter year: ");
        year = Brother.nextInt();
        LocalDate thatDay = LocalDate.of(year, month, day);
        Period extinction = Period.between(today, thatDay);
        System.out.println("Number of days: " + extinction.getDays());
    }
}
