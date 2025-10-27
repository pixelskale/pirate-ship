import java.util.ArrayList;
public class VendingMachine {
    private ArrayList<DrinkBox> drinkList = new ArrayList<DrinkBox>();
    private int revenue;
    private static final int defaultStock = 2;
    public VendingMachine() {
        drinkList.add(new DrinkBox("Coke", 13, 2));
        drinkList.add(new DrinkBox("Sprite", 13, 2));
        drinkList.add(new DrinkBox("GreenTea", 20, 2));
        drinkList.add(new DrinkBox("Water", 10, 2));
        drinkList.add(new DrinkBox("MinuteMaid", 18, 2));
        drinkList.add(new DrinkBox("Pepsi", 13, 2));
        drinkList.add(new DrinkBox("Vitamilk", 15, 2));
        drinkList.add(new DrinkBox("RootBeer", 13, 2));
    }
    public String buy(String name, Card c) {
        int targetIndex = 0;
        boolean foundIndex = false;
        for (DrinkBox box : this.drinkList) {
            if (box.getName().equals(name)) {
                targetIndex = this.drinkList.indexOf(box);
                foundIndex = true;
            }
        }
        if (!foundIndex) { return "Drink not found"; }
        DrinkBox targetBox = this.drinkList.get(targetIndex);
        if (targetBox.getAmount() <= 0) { return "Out of stock"; }
        if (!(c.getCardID() >= 1 && c.getCardID() <= 100)) { return "Invalid card"; }
        if (!(c.pay(targetBox.getPrice()))) { return "Not enough money"; }
        else {
            targetBox.setAmount(targetBox.getAmount()-1);
            this.revenue += targetBox.getPrice();
            return "Thank you";
        }
    }
    public void endOfDayProcess() {
        for (DrinkBox box : this.drinkList) {
            box.setAmount(VendingMachine.defaultStock);
        }
        this.revenue = 0;
    }
    public int getRevenue() {
        return this.revenue;
    }
    public String getDrinkDetail() {
        String master = "**********************\n";
        for (DrinkBox box : this.drinkList) {
            master = master + box.getName() + " ";
            master = master + box.getPrice() + " ";
            master = master + box.getAmount() + "\n";
        }
        return master;
    }
}
