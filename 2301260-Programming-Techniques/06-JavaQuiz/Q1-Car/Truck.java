public class Truck extends Car {
    private double M_weight;
    private double weight;
    public Truck(double gas, double efficiency, double M_weight, double weight) {
        super(gas, efficiency);
        this.M_weight = M_weight;
        if (M_weight < weight) {
            this.weight = M_weight;
        }
        else {
            this.weight = weight;
        }
    }
    @Override
    public void drive(double distance) {
        double usage;
        if (this.weight < 1) { usage = distance / this.getEfficiency(); }
        else if (this.weight <= 10) { usage = (distance / this.getEfficiency()) * 1.1; }
        else if (this.weight <= 20) { usage = (distance / this.getEfficiency()) * 1.2; }
        else { usage = (distance / this.getEfficiency()) * 1.3; }
        if (this.getGas() < usage) {
            System.out.println("You cannot drive too far, please add gas");
        }
        else {
            this.setGas(this.getGas() - usage);
        }
    }
}
