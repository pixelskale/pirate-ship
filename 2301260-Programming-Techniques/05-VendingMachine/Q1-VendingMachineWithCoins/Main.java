import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VendingMachine v = new VendingMachine();
        ArrayList<Integer> myCoin = new ArrayList<Integer>();
        //Card c1 = new Card(100);
        //Card c2 = new Card(50);
        String drinkName;
        System.out.println(v.toString());
        //System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.nextLine();
        System.out.print("Enter your coin(s): ");
        String myInput1 = input.nextLine();
        myCoin.clear();
        String[] arrMyInput1 = myInput1.split("\\s+");
        for (String arrMyInputEach : arrMyInput1) {
            myCoin.add(Integer.parseInt(arrMyInputEach));
        }
        System.out.println(v.buy(drinkName, myCoin));
        //System.out.println(v.buy(drinkName, c1)); //use card c1
        //System.out.println("CardID: " + c1.getCardID() + " Card amount left: " + c1.getAmount());

        System.out.println(v.toString());
        //System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.nextLine();
        System.out.print("Enter your coin(s): ");
        String myInput2 = input.nextLine();
        myCoin.clear();
        String[] arrMyInput2 = myInput2.split("\\s+");
        for (String arrMyInputEach : arrMyInput2) {
            myCoin.add(Integer.parseInt(arrMyInputEach));
        }
        System.out.println(v.buy(drinkName, myCoin));
        //System.out.println(v.buy(drinkName, c2)); //use card c2
        //System.out.println("CardID: " + c2.getCardID() + " Card amount left: " + c2.getAmount());

        System.out.println(v.toString());
        //System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.nextLine();
        System.out.print("Enter your coin(s): ");
        String myInput3 = input.nextLine();
        myCoin.clear();
        String[] arrMyInput3 = myInput3.split("\\s+");
        for (String arrMyInputEach : arrMyInput3) {
            myCoin.add(Integer.parseInt(arrMyInputEach));
        }
        System.out.println(v.buy(drinkName, myCoin));
        //System.out.println(v.buy(drinkName, c2)); //use card c2
        //System.out.println("CardID: " + c2.getCardID() + " Card amount left: " + c2.getAmount());

        System.out.println(v.toString());
        //System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.nextLine();
        System.out.print("Enter your coin(s): ");
        String myInput4 = input.nextLine();
        myCoin.clear();
        String[] arrMyInput4 = myInput4.split("\\s+");
        for (String arrMyInputEach : arrMyInput4) {
            myCoin.add(Integer.parseInt(arrMyInputEach));
        }
        System.out.println(v.buy(drinkName, myCoin));
        //System.out.println(v.buy(drinkName, c2)); //use card c2
        //System.out.println("CardID: " + c2.getCardID() + " Card amount left: " + c2.getAmount());

        System.out.println("\n====Simulate end of day====");
        System.out.println("Revenue: " + v.getRevenue());
        v.endOfDayProcess();
        System.out.println(v.toString());
    }
}
