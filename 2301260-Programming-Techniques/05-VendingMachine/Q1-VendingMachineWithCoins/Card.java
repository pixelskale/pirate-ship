public class Card {
    private static int count = 0;
    public static final int MINVALUE = 10;
    private int cardID;
    private int amount;
    public Card(int amount) {
        Card.count++;
        this.cardID = Card.count;
        this.amount = amount;
    }
    public int getCardID() {
        return cardID;
    }
    public int getAmount() {
        return amount;
    }
    public void addMoney(int amount) {
        this.amount += amount;
    }
    public boolean pay(int amount) {
        if (this.getAmount() - amount < Card.MINVALUE) { return false; }
        else {
            this.amount -= amount;
            return true;
        }
    }
}
