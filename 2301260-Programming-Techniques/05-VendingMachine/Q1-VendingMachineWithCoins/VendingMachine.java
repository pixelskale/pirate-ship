import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class VendingMachine {
    private ArrayList<DrinkBox> drinkList = new ArrayList<DrinkBox>();
    private ArrayList<CoinBox> coinList = new ArrayList<CoinBox>();
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
        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
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
        if (!foundIndex) { return "Drink not found\n"; }
        DrinkBox targetBox = this.drinkList.get(targetIndex);
        if (targetBox.getAmount() <= 0) { return "Out of stock\n"; }
        if (!(c.getCardID() >= 1 && c.getCardID() <= 100)) { return "Invalid card\n"; }
        if (!(c.pay(targetBox.getPrice()))) { return "Not enough money\n"; }
        else {
            targetBox.setAmount(targetBox.getAmount()-1);
            this.revenue += targetBox.getPrice();
            return "Thank you\n";
        }
    }
    public String buy(String name, ArrayList<Integer> coinValue) {
        int targetIndex = 0;
        boolean foundIndex = false;
        for (DrinkBox box : this.drinkList) {
            if (box.getName().equals(name)) {
                targetIndex = this.drinkList.indexOf(box);
                foundIndex = true;
            }
        }
        if (!foundIndex) { return "Drink not found\n"; }
        DrinkBox targetBox = this.drinkList.get(targetIndex);
        if (targetBox.getAmount() <= 0) { return "Out of stock\n"; }
        int coinSum = 0;
        ArrayList<CoinBox> coinEnteredList = new ArrayList<CoinBox>();
        ArrayList<CoinBox> coinChangeList = new ArrayList<CoinBox>();
        for (Integer coin : coinValue) {
            coinSum += coin;
            boolean foundCoin = false;
            for (CoinBox coinEntered : coinEnteredList) {
                if (coin == coinEntered.getValue()) {
                    coinEntered.setAmount(coinEntered.getAmount()+1);
                    foundCoin = true;
                }
            }
            if (!foundCoin) { coinEnteredList.add(new CoinBox(coin, 1)); }
        }
        if (coinSum < targetBox.getPrice()) { return "Not enough money\n"; }
        int remainingChange = coinSum - targetBox.getPrice();
        this.coinList.sort(Collections.reverseOrder());
        for (CoinBox coinChange : this.coinList) {
            int maxAmount = Math.floorDiv(remainingChange, coinChange.getValue());
            int actualAmount = Math.min(maxAmount, coinChange.getAmount());
            if (actualAmount != 0) {
                coinChangeList.add(new CoinBox(coinChange.getValue(), actualAmount));
                remainingChange -= coinChange.getValue() * actualAmount;
            }
        }
        if (remainingChange > 0) { return "Cannot give change\n"; }
        else {
            targetBox.setAmount(targetBox.getAmount()-1);
            this.revenue += targetBox.getPrice();
            for (CoinBox coinEntered : coinEnteredList) {
                boolean foundCoin = false;
                for (CoinBox coinListEach : this.coinList) {
                    if (coinEntered.getValue() == coinListEach.getValue()) {
                        coinListEach.setAmount(coinListEach.getAmount()+1);
                        foundCoin = true;
                    }
                }
                if (!foundCoin) { this.coinList.add(new CoinBox(coinEntered.getValue(), 1)); }
            }
            Collections.sort(this.coinList);
            if (!coinChangeList.isEmpty()) {
                String master = "Thank you\nHere's your change:\n";
                Collections.sort(coinChangeList);
                for (CoinBox coinChange : coinChangeList) {
                    master = master + coinChange.getValue() + " Baht ";
                    master = master + coinChange.getAmount() + " Coin(s)\n";
                    int boomIndex = 0;
                    boolean exterminate = false;
                    for (CoinBox coinRemove : this.coinList) {
                        if (coinChange.getValue() == coinRemove.getValue()) {
                            coinRemove.setAmount(coinRemove.getAmount() - coinChange.getAmount());
                            if (coinRemove.getAmount() == 0) {
                                boomIndex = this.coinList.indexOf(coinRemove);
                                exterminate = true;
                            }
                        }
                    }
                    if (exterminate) { this.coinList.remove(boomIndex); }
                }
                return master;
            }
            else {
                return "Thank you\nPaid exact amount, no change.\n";
            }
        }
    }
    public void endOfDayProcess() {
        for (DrinkBox box : this.drinkList) {
            box.setAmount(VendingMachine.defaultStock);
        }
        coinList.clear();
        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
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
    public String toString() {
        String master = this.getDrinkDetail();
        master = master + "**********************\n";
        for (CoinBox coinListEach : this.coinList) {
            if (coinListEach.getAmount() != 0 ) {
                master = master + coinListEach.getValue() + " Baht ";
                master = master + coinListEach.getAmount() + " Coin(s)\n";
            }
        }
        return master;
    }
}
