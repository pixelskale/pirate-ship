public class Hybrid extends Bus implements LiquidFuel, Electric {
    private double range;
    private double voltage;
    private int emissionTier;
    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
        if (voltage < Electric.LOW_VOLTAGE) { this.voltage = Electric.LOW_VOLTAGE; }
        else if (voltage > Electric.HIGH_VOLTAGE) { this.voltage = Electric.HIGH_VOLTAGE; }
        else { this.voltage = voltage; }
    }
    @Override
    public double getAccel() {
        return 4.0;
    }
    @Override
    public double getRange() {
        return this.range;
    }
    @Override
    public double getVoltage() {
        return this.voltage;
    }
    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }
}
