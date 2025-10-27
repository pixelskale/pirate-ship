public class CoinBox implements Comparable<CoinBox> {
    private int value;
    private int amount;
    public CoinBox(int value, int amount) {
        this.value = value;
        this.amount = amount;
    }
    public int getValue() {
        return value;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public int compareTo(CoinBox other) {
        if (this.value == other.value)
            return 0;
        else if (this.value > other.value)
            return 1;
        else
            return -1;
    }
}
