public class CNGBus extends Bus implements LiquidFuel {
    private double range;
    private int emissionTier;
    public CNGBus(int capacity, double cost, double range, int emissionTier) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
    }
    @Override
    public double getAccel() {
        return 3.0;
    }
    @Override
    public double getRange() {
        return this.range;
    }
    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }
}
